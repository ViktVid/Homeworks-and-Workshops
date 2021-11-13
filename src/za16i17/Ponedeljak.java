package za16i17;

import java.util.Scanner;

public class Ponedeljak {

	public static void main(String[] args) {

/* While1:
		Napisati program koji unosi i sabira brojeve dokle god nije unesen negativan broj, i ispisuje njihov zbir (zbir pozitivnih brojeva).
		Primer: ako korisnik unese 1 2 5 3 -1, program treba da ispise 11 */
		
		Scanner pozitivanBroj = new Scanner(System.in);
		double broj = 0;
		double zbir = 0;

		while (broj >= 0) {

			System.out.print("Unesite neki pozitivan broj: ");
			broj = pozitivanBroj.nextInt();

			if (broj < 0) {
				break;
			}

			zbir = zbir + broj;

		}
		pozitivanBroj.close();
		System.out.println("Zbir pozitivnih brojeva je: " + zbir); 

/* While2:
		Napisati program koji ce na standardnom izlazu ispisati poruku “Laku noc!” onoliko puta koliko je korisnik zadao preko konzole.
		Primer: ako korisnik unese broj 20, poruku Laku noc! treba ispisati 20 puta */
				
		System.out.print("Koliko puta zelite da vam kazemo 'Laku noc!'? ");

		Scanner lakuNoc = new Scanner(System.in);
		int ln = lakuNoc.nextInt();
		int i = 0;

		while (i < ln) {

			i++;

			System.out.println("Laku noc!");
		}
		lakuNoc.close();
		System.out.println("Lepo spavajte.");
	}

}
