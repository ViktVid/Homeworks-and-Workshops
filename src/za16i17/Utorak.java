package za16i17;

import java.util.Scanner;

public class Utorak {

	public static void main(String[] args) {

/* ZADATAK
Napisati program koji oponasa kviz za pogadjanje glavnog grada.
Program treba da ispisuje 3 opcije za izbor drzave + 1 opciju kao izlaz iz programa. 
1. Francuska 2. Italija 3. Srbija 4. Izlaz
Nakon odabira drzave, potrebno je postaviti pitanje 'Koji je glavni grad drzave xxxxxxx ?'
Ako korisnik odgovori tacno, ispisuje se poruka 'Odgovor je tacan'
Ako korisnik odgovori netacno, ispisuje se poruka 'Odgovor nije tacan'
Nakon davanja odgovora (bilo da je tacan ili netacan), ponovo treba da se postave sve pocetne opcije i ponudi korisniku da odabere neku od njih.
Program se zavrsava kad korisnik odabere 4. opciju 'Izlaz' */

		System.out.println("Pravilo: Koristite onu formu pisanja koja je koriscena u kvizu!");
		Scanner kviz = new Scanner(System.in);
		String s;
		String unos;
		boolean indicator = true;
		do {
			System.out.println(
					"Ispisite naziv jedne od ovih drzava: Francuska, Italija, Srbija; \nUkoliko zelite da izadjete ispisite 'Izlaz'.");

			s = kviz.next();

			switch (s) {

			case ("Francuska"):
				System.out.println("Koji je glavni grad Francuske?");
				unos = kviz.next();
				if (unos.equals("Pariz"))
					System.out.println("Odgovor je tacan!");
				else if (unos.equals("Izlaz"))

				{
					System.out.println("");
					indicator = false;
					break;
				} else
					System.out.println("Odgovor nije tacan!");
				break;
			case "Italija":
				System.out.println("Koji je glavni grad Italije?");
				unos = kviz.next();
				if (unos.equals("Rim"))
					System.out.println("Odgovor je tacan!");
				else if (unos.equals("Izlaz"))

				{
					System.out.println("");
					indicator = false;
					break;
				} else
					System.out.println("Odgovor nije tacan!");
				break;
			case "Srbija":
				System.out.println("Koji je glavni grad Srbije?");
				unos = kviz.next();
				if (unos.equals("Beograd"))
					System.out.println("Odgovor je tacan!");
				else if (unos.equals("Izlaz"))

				{
					System.out.println("");
					indicator = false;
					break;
				} else
					System.out.println("Odgovor nije tacan!");
				break;
			case "Izlaz":
				indicator = false;
				break;
			}
		} while (indicator);

		kviz.close();
		System.out.println("Napustili ste kviz!");

	}

}