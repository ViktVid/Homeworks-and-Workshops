package za23i24;

import java.util.Scanner;

public class Ponedeljak2 {

	public static void main(String[] args) {
/*
 Napisati program koji ce procitati 3 cela broja sa standardnog ulaza i taj program treba da pozove i vrati (u mainu) proizvod unetih brojeva.
 */

		Scanner mnozenje = new Scanner(System.in);
		
		int[] unosBrojeva = new int[3];
		for (int i = 0; i < unosBrojeva.length; i++) {
			System.out.println("Unesi broj za mnozenje:");
			unosBrojeva[i] = mnozenje.nextInt();
		}
		mnozenje.close();

		int proizvod = product(unosBrojeva);
		System.out.println("\nProizvod unetih brojeva je: " + proizvod);
	}

	private static int product(int[] unos) {
		
		int proizvod = unos[0];
		for (int i = 1; i < unos.length; i++) {
			proizvod *= unos[i];
		}
		return proizvod;

	}

}
