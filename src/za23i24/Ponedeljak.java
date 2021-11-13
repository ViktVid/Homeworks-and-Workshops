package za23i24;

import java.util.Scanner;

public class Ponedeljak {

	public static void main(String[] args) {
/* Domaci:
Funkcije1:
Napisati program koji ce procitati 3 cela broja sa standardnog ulaza (znaci da korisnik unosi tri broja)
i taj program treba da pozove i ispise (u mainu) najmanji od ta tri unesena broja
*/
		
		Scanner najmanjiBroj = new Scanner(System.in);

		int[] unosBrojeva = new int[3];
		for (int i = 0; i < unosBrojeva.length; i++) {
			System.out.println("Unesi broj:");
			unosBrojeva[i] = najmanjiBroj.nextInt();
		}
		najmanjiBroj.close();

		int min = minimum(unosBrojeva);
		System.out.println("\nNajmanji broj je: " + min);

	}

	private static int minimum(int[] unos) {
		int min = unos[0];
		for (int i = 0; i < unos.length; i++) {
			if (min > unos[i]) {
				min = unos[i];
			}
		}
		return min;
	}

}
