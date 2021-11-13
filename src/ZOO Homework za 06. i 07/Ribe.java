package za06i07;

public class Ribe extends ZooVrt {

	private String mestoObitavanja;
	private int brojPeraja;
	private String vrstaPeraja;
	
	
	
	public Ribe(String vrstaZivotinje, String ime, String ishrana, String mestoObitavanja, int brojPeraja, String vrstaPeraja) {
		super(vrstaZivotinje, ime, ishrana);
		this.mestoObitavanja = mestoObitavanja;
		this.brojPeraja = brojPeraja;
		this.vrstaPeraja = vrstaPeraja;
	}


	
	public String getMestoObitavanja() {
		return mestoObitavanja;
	}

	public void setMestoObitavanja(String mestoObitavanja) {
		this.mestoObitavanja = mestoObitavanja;
	}

	public int getBrojPeraja() {
		return brojPeraja;
	}

	public void setBrojPeraja(int brojPeraja) {
		this.brojPeraja = brojPeraja;
	}

	public String getVrstaPeraja() {
		return vrstaPeraja;
	}

	public void setVrstaPeraja(String vrstaPeraja) {
		this.vrstaPeraja = vrstaPeraja;
	}

	public void stampanje() {
		System.out.println("Ova riba je " + getVrstaZivotinje() + ", zove se " + getIme()
				+ " - voleli bismo da joj je omiljena hrana " + getIshrana() + "." + " Voda u kojoj zivi je "
				+ getMestoObitavanja() + " i ima " + getBrojPeraja() + " peraja vrste: " + getVrstaPeraja());
	}

}
