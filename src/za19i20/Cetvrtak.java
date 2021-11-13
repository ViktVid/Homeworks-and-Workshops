package za19i20;

import java.util.Scanner;

public class Cetvrtak {

	public static void main(String[] args) {
/*
-Napisati program gde korisnik unosi pozitivne brojeve,
kad unese negativan broj prikaze mu se suma svih prethodno unetih brojeva i na kraju zakomentarisati koje ste brojeve sve unosili po testu
na primer:
//test 1 x, y, z
//test 2 x, y, z
//test 3 x, y, z
(Koristiti do while petlju)			*/
		
		Scanner pozitivanBroj = new Scanner(System.in);

		double pozitivanBr = 0;
		double sum = 0;

		do {

			sum = sum + pozitivanBr;
			System.out.print("Unesite neki pozitivan broj: ");
			pozitivanBr = pozitivanBroj.nextDouble();

		} while (pozitivanBr >= 0);
		System.out.println("Zbir pozitivnih brojeva je: " + sum);
		
		pozitivanBroj.close();

	}

}
