package za23i24;

import java.util.Scanner;

public class Ponedeljak3 {

	public static void main(String[] args) {
/*
 -> Napisati program koji ce procitati 3 cela broja sa standardnog ulaza i poziva i ispisuje dve metode.
Prva ispisuje zbir tri unesena broja, a druga vraca najveci od unetih brojeva.
*/
		
		Scanner kombinacijaZadataka = new Scanner(System.in);

		int[] unosBrojeva = new int[3];
		for (int i = 0; i < unosBrojeva.length; i++) {
			System.out.println("Unesi broj:");
			unosBrojeva[i] = kombinacijaZadataka.nextInt();
		}
		kombinacijaZadataka.close();

		int zbir = sabiranje(unosBrojeva);
		int max = maksimum(unosBrojeva);
		System.out.println("Zbir unetih brojeva je: " + zbir + "\nNajveci broj je: " + max);

	}

	private static int sabiranje(int[] unos) {
		int zbir = unos[0];
		for (int i = 1; i < unos.length; i++) {
			zbir += unos[i];
		}
		return zbir;
	}

	private static int maksimum(int[] unos) {
		int max = unos[0];
		for (int i = 0; i < unos.length; i++) {
			if (max < unos[i]) {
				max = unos[i];
			}
		}
		return max;

	}

}
