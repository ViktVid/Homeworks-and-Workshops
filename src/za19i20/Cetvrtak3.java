package za19i20;

import java.util.Scanner;

public class Cetvrtak3 {

	public static void main(String[] args) {
/*
Napisati program koji stampa sliku na ekranu za N redova. N unosi korisnik preko skenera.
(Koristiti for petlju)
Na primer N: 5
*
**
***
****
***** 		 */
	
		Scanner zvezda = new Scanner(System.in);
		System.out.println("Unesite iskljucivo ceo broj: ");

		int n = zvezda.nextInt();
		String z = "*";

		for (int a = 0; a < n; a++) {
			System.out.println(z);
			z = z + "*";

		}
		zvezda.close();
	}
} 
