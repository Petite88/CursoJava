package com.laura;

import java.util.Random;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {


		String intergerPattern = "\\d+";

		Random x = new Random();
		int n;
		n = x.nextInt(9) + 1;
		System.out.println("n" + n);
		boolean acertado = false;
		Scanner numCliente = new Scanner(System.in);
		do {
			System.out.println("Introduce un número");
			boolean formatCorrect = true;
			String tempNumber = numCliente.next();
			if (tempNumber == null || !tempNumber.trim().matches(intergerPattern)) {
				System.out.println("Número con formato incorrecto");
				formatCorrect = false;
			}
			if (formatCorrect) {
				int a = Integer.valueOf(tempNumber);
				if (a == n) {
					System.out.println("Has acertado el número");
					acertado = true;
				} else {
					if (a > n) {
						System.out.println("El numero que buscas es menor");
					} else {
						System.out.println("El numero que buscas es mayor");
					}
				}
			}

		} while (!acertado);
		numCliente.close();
	}

}
