package za09i10;

public class Autobus {

	
	/*Autobus poseduje naziv, vozaca, cenu karte i putnika koji se njime voze. Naziv i 
	cena karte i zadaju se prilikom kreiranja. Moguce je dodati/ukloniti putnika kao i vozaca.
*/
	private String naziv;
	private int cnKarte;
	private Vozac voz;
	private Putnik put;
	public Autobus(String naziv, int cnKarte, Vozac voz, Putnik put) {
		this.naziv = naziv;
		this.cnKarte = cnKarte;
		this.voz = voz;
		this.put = put;
	}
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	public int getCnKarte() {
		return cnKarte;
	}
	public void setCnKarte(int cnKarte) {
		this.cnKarte = cnKarte;
	}
	public Vozac getVoz() {
		return voz;
	}
	public void setVoz(Vozac voz) {
		this.voz = voz;
	}
	public Putnik getPut() {
		return put;
	}
	public void setPut(Putnik put) {
		this.put = put;
	}
public String toString() {
		
		return "\nAutobus: " + naziv +"\n" + voz + "Cena karte: " + cnKarte + "din." + "\n" + put;
	
	
	
  }
}