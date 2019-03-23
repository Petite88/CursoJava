package com.laura;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class App2 {
	static final int RESULTADO_OK = 0;
	static final int RESULTADO_LARGO = 1;
	static final int RESULTADO_CORTO = -1;

	public static void main(String[] args) {
		int entrada, numeroAleatorio, acierto, maximo, minimo;
		Limites limites = new Limites(0, 10, 0);
		do {
			entrada = pedirNumero(limites);
			numeroAleatorio = calcularNumeroAleatorio(entrada, limites);
			evaluarNumero(entrada, numeroAleatorio, limites);
			mensaje(limites);
		} while (limites.getAcierto() != RESULTADO_OK);
	}

	public static int pedirNumero(Limites limites) {
		int entrada;

		Scanner numCliente = new Scanner(System.in);
		System.out.println("Introduce un número del " + limites.getMinimo() + " al " + limites.getMaximo());
		entrada = numCliente.nextInt();
		return entrada;

	}

	public static int calcularNumeroAleatorio(int entrada, Limites limites) {
		int numeroAleatorio;
		Random generadorAleatorio = new Random();
		if (limites.getAcierto() == RESULTADO_OK) {
			numeroAleatorio = generadorAleatorio.nextInt(9) + 1;
			System.out.println("valor aleatorio a primero: " + numeroAleatorio);
		} else if (limites.getAcierto() == RESULTADO_LARGO) {
			numeroAleatorio = generadorAleatorio.nextInt(entrada) + 1;
			System.out.println("valor aleatorio a largo: " + numeroAleatorio);
		} else {
			numeroAleatorio = generadorAleatorio.nextInt(9 - entrada + 1) + entrada;
			System.out.println("valor aleatorio a corto: " + numeroAleatorio);
		}

		return numeroAleatorio;

	}

	public static void evaluarNumero(int entrada, int numeroAleatorio, Limites limites) {

		if (numeroAleatorio == entrada) {
			limites.setAcierto(RESULTADO_OK);
		} else if (numeroAleatorio > entrada) {
			limites.setAcierto(RESULTADO_CORTO);
			limites.setMaximo(entrada);
		} else {
			limites.setAcierto(RESULTADO_LARGO);
			limites.setMaximo(numeroAleatorio);
		}
	}

	public static void mensaje(Limites limites) {
		if (limites.getAcierto() == RESULTADO_OK) {
			System.out.println("Has acertado");
		} else if (limites.getAcierto() == RESULTADO_CORTO) {
			System.out.println("Te has quedado corto");
		} else {
			System.out.println("Te has pasado!");
		}

	}
}
