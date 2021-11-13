package za09i10;

public class Covek {

	// Covek poseduje ime i prezime koji se dodeljuju prilikom kreiranja objekta.
	// Svi podaci mogu da se dohvate, ali ne i postave.
	private String imePrezime;

	public Covek(String imePrezime) {

		this.imePrezime = imePrezime;
	}

	public String getImePrezime() {
		return imePrezime;
	}
}