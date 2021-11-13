package za19i20;

import java.util.Scanner;

public class Petak {

	public static void main(String[] args) {
		
/* Domaci:
 	*Napisati program gde u nizu napisete 5 gradova, a program vam odstampa sve osim prvog i poslednjeg unosa.
*/
	
		Scanner grad = new Scanner(System.in);
		System.out.println("Unesite 5 gradova: ");

		String gradovi = grad.next();

		
		
		int g = gradovi.length();
		String[] unos = gradovi.split("\\W");

		for (int i = 0; i < gradovi.length() - 1; i++) {
			System.out.println("Vasi gradovi su:[" + i + "]: " + gradovi);
		}
	}

}
