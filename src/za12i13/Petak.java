package za12i13;

import java.util.Scanner;

public class Petak {
	
	public static void main(String[] args) {

/*Napisati program gde preko skenera unesete broj, ako je broj manji od 10 onda ga pomnoziti sa 100, ako je broj veci od 100 onda ga podeliti sa 10.
Na kraju zakomentarisite koje brojeve ste koristili za proveru programa.*/
		
		Scanner broj = new Scanner(System.in);
		System.out.println("Unesite neki broj: ");
		
		double b = broj.nextDouble();
		
		if (b < 10) {
			System.out.println("Trazeni iznos: " + (b * 100));
		} else if (b > 100) {
			System.out.println("Trazeni iznos: " + (b / 10));
		} else {
			System.out.println("Trazeni iznos: " + b);
		}
		
		/* Korisceni brojevi za proveru:
		 * 5; 15; 110; 6.3; 115.8
		 */
	
		
		/*Napisati program gde kroz switch se unosi broj od 1 do 12 i program ispisuje koji je to mesec u godini. 
		 Ako korisnik unese drugi broj treba da se ispise poruka "Potrebno je uneti broj od 1 do 12" */
		
Scanner mesec = new Scanner(System.in);
		
		System.out.print("Upisite broj meseca: ");
		
		int m = mesec.nextInt();
		
		switch( m ) {
		case 1:
			System.out.println("Januar.");
			break;
		case 2:
			System.out.println("Februar.");
			break;
		case 3:
			System.out.println("Mart.");
			break;
		case 4:
			System.out.println("April.");
			break;
		case 5:
			System.out.println("Maj.");
			break;
		case 6:
			System.out.println("Jun.");
			break;
		case 7:
			System.out.println("Jul.");
			break;
		case 8:
			System.out.println("Avgust.");
			break;
		case 9:
			System.out.println("Septembar.");
			break;
		case 10:
			System.out.println("Oktobar.");
			break;
		case 11:
			System.out.println("Novembar.");
			break;
		case 12:
			System.out.println("Decembar.");
			break;
		default:
			System.out.println("Potrebno je uneti broj od 1 do 12.");
		
		}
		
	}

}
