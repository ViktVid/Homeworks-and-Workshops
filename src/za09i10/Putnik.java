package za09i10;

public class Putnik extends Covek {
    
	/*Putnik je covek koji poseduje novac. 
	 * Inicijalno poseduje odredjenu kolicinu novca koja mu se zadaje prilikom kreiranja. 
	 * Odredjena svota novca moze da mu se doda i/ili oduzme.
	*/
	private int novac;

	public Putnik(String imePrezime, int novac) {
		super(imePrezime);
		this.novac = novac;
	}

	public int getNovac() {
		return novac;
	}

	public void setNovac(int novac) {
		this.novac = novac;
	}
public String toString() {
		
		return "Putnik: " + super.getImePrezime() + ", ima sumu od: " + novac + "din.";
	
	
	
	
   }
}