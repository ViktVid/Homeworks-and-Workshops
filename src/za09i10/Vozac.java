package za09i10;

public class Vozac extends Covek {

//	Vozac je covek koji poseduje i zvanje (zanimanje -> sofer).
	private String zanimanje;
	

	public Vozac(String imePrezime, String zanimanje) {
		super(imePrezime);
		this.zanimanje=zanimanje;
	}

	public String getZanimanje() {
		return zanimanje;
	}

	public void setZanimanje(String zanimanje) {
		this.zanimanje = zanimanje;
	}
	
	public String toString() {
		
		return "Vozac: " + super.getImePrezime() + "\nZanimanje: " + zanimanje +"\n";
		
	}
	
	
}
