package za19i20;

public class Petak2 {

	public static void main(String[] args) {

/* Domaci:
	Napisati program gde u nizu napisete ovih 5 gradova (Lisabon, London, Helsinki, Prag i Madrid) a program
	stampa gradove sve dok ne dodje do "Prag"-a		 
 */

		String[] gradovi = { "Lisbon", "London", "Helsinki", "Prag", "Madrid" };

		for (String g : gradovi) {
			System.out.println(g);

			if (g.equals("Prag"))
			{
				break;
			}
		}
		
	}

}
