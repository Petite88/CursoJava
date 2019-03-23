package com.laura;

import java.util.Scanner;
import java.util.Random;

public class App3 {
	public static void main(String[] args) {
		// Pintar menu
		procesoPrograma();
	}

	public static void pintarMenu() {
		System.out.println("MENÚ");
		System.out.println("------------------------");
		System.out.println("1-Cargar el array A");
		System.out.println("2-Cargar el array B");
		System.out.println("3-Mostrar el array A");
		System.out.println("4-Mostrar el array B");
		System.out.println("5-Mostrar el resultado de A+B");
		System.out.println("6-Mostrar el resultado de A*B");
		System.out.println("7-Mostrar el Array A al revés");
		System.out.println("8-Salir");
	}

	public static int opcionElegida() {
		Scanner opcionMenu = new Scanner(System.in);
		System.out.println("Introduce una opcion(1-8): ");
		int opcionElegida = opcionMenu.nextInt();
		return opcionElegida;
	}

	public static int[] procesoPrograma() {
		int[] A = new int[0];
		int[] B = new int[0];

		boolean terminar = false;
		do {
			pintarMenu();
			int opcionElegida = opcionElegida();
			switch (opcionElegida) {
			case 1:
				A = new int[10];
				A = generarValores();
				break;
			case 2:
				B = new int[10];
				B = generarValores();
				break;
			case 3:
				if (A.length == 0) {
					System.out.println("La variable A no está inicializada");
				} else {
					pintarVector(A);
				}
				break;
			case 4:
				if (B.length == 0) {
					System.out.println("La variable B no está inicializada");
				} else {
					pintarVector(B);
				}
				break;
			case 5:
				if (A.length == 0 || B.length == 0) {
					System.out.println("Alguno de los vectores no está inicializado");
				}else {
					sumaVectores(A,B);
				}
				break;
			case 6:
				if (A.length == 0 || B.length == 0) {
					System.out.println("Alguno de los vectores no está inicializado");
				}else {
					multiplicacionVectores(A,B);
				}
				break;				
			case 7:
				if (A.length == 0) {
					System.out.println("El vector A no está inicializado");
				}else {
					pintarVectorInverso(A);
				}
				break;
			case 8:
				terminar=true;
			}

		} while (!terminar);
		return null;
	}

	private static void sumaVectores(int[] a, int[] b) {
		for (int i = 0; i < a.length; ++i) {
			System.out.print(a[i] + b[i] + ",");
		}
		System.out.println();
		
	}
	private static void multiplicacionVectores(int[] a, int[] b) {
		for (int i = 0; i < a.length; ++i) {
			System.out.print(a[i]*b[i] + ",");
		}
		System.out.println();
		
	}
	private static void pintarVector(int[] vector) {

		for (int valor: vector) {
			System.out.print(valor + " , " );
		}
		System.out.println();
	}
	private static void pintarVectorInverso(int[] vector) {
		for (int i = vector.length - 1; i >= 0; --i) {
			System.out.print(vector[i]+ ",");
		}
		System.out.println();
	}

	public static int[] generarValores() {
		int[] vector = new int[10];
		Random generadorAleatorio = new Random();
		for (int i = 0; i < vector.length; ++i) {
			vector[i] = generadorAleatorio.nextInt(9) + 1;
		}
		return vector;
	}

}
