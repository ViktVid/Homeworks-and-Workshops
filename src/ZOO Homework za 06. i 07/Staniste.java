package za06i07;

public class Staniste extends ZooVrt {
	// Napraviti klasu Staniste u kom se nalazi lista zivotinja koje u tom stanistu zive.
	// Staniste takodje ima naziv koji moze da se dohvati ali ne i postavi.

	private String[] listaZivotinja;
	private String nazivStanista;

	public Staniste(String vrstaZivotinje, String ime, String ishrana, String[] listaZivotinja, String nazivStanista) {
		super(vrstaZivotinje, ime, ishrana);
		this.listaZivotinja = listaZivotinja;
		this.nazivStanista = nazivStanista;
	}

	public String[] getListaZivotinja() {
		return listaZivotinja;
	}

	public String getNazivStanista() {
		return nazivStanista;
	}

	public void setListaZivotinja(String[] listaZivotinja) {
		this.listaZivotinja = listaZivotinja;
	}

	public void stampanje() {
		System.out.println("Ovo staniste se zove: " + nazivStanista + "\nU ovom stanistu zive:");
		for (int i = 0; i < listaZivotinja.length; i++) {
			System.out.print(listaZivotinja[i]);
		}
	}
}