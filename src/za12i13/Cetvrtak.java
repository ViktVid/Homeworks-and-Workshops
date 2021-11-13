package za12i13;

import java.util.Scanner;

public class Cetvrtak {

	public static void main(String[] args) {

		String ime = "Viktoria";
		String prezime = "Videnovic";
		char pol = 'Z';
		
		System.out.println("Ime: " + ime + "\n" + "Prezime: " + prezime + "\n" + "Pol: " + pol);
		
		Scanner m = new Scanner(System.in);
		System.out.println("Unesite broj medalja koje je Srbija osvojila na olimpijskim igrama: ");

		int medalje = m.nextInt();

		System.out.println("Broj ukupno osvojenih medalja: " + medalje);
		
		Scanner zm = new Scanner(System.in);
		System.out.println("Unesite broj zlatnih medalja koje je Srbija osvojila na olimpijskim igrama: ");

		int zlatneMedalje = zm.nextInt();

		System.out.println("Broj ukupno osvojenih zlatnih medalja: " + zlatneMedalje);	
		
		
		double procenatMedalja = (zlatneMedalje * 100) / medalje;
		System.out.println("Procenat zlatnih medalja u odnosu na ukupan broj medalja je: " + procenatMedalja + "%");
		
		m.close();
		zm.close();
	}

}
