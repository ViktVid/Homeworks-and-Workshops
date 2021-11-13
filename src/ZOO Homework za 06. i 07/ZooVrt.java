package za06i07;

public class ZooVrt {

/*	Zooloski vrt
U zoovrtu obitavaju razne zivotinje. Sve imaju svoju vrstu (kicmenjaci, beskicmenjaci), konkretan naziv i cime se hrane.
RIBA: VRSTA, NAZIV, ISHRANA
Ribe su kicmenjaci koje karakterise mesto obitavanja (slatka, slana voda), broj peraja, vrsta peraja
BROJ PERAJA, VRSTA PERAJA
Sisari su kicmenjaci koje se razlikuju po boji dlake, nacinu ishrane (biljojedi, mesojedi, svastojedi), i covekovoj podeli na divlje i domace.
SISARI: BOJA DLAKE, NACIN ISHRANE, DIVLJA/DOMACA
Napraviti klasu Staniste u kom se nalazi lista zivotinja koje u tom stanistu zive. Staniste takodje ima naziv koji moze da se dohvati ali ne i postavi.
STANISTE: LISTA ZIVOTINJA - NAZIV STANISTA (MOZE DA SE DOHVATI, ALI NE I POSTAVI)
Ispisati bar jednog sisara i jednu ribu kao vrstu zivotinje.
Ispisati bar jedno staniste.
Jednom sisaru zameniti ulogu koju mu je covek dodelio. 
+ ZAMENA PODELE */
	
	private String vrstaZivotinje;
	private String ime;
	private String ishrana;

	public ZooVrt(String vrstaZivotinje, String ime, String ishrana) {
		this.vrstaZivotinje = vrstaZivotinje;
		this.ime = ime;
		this.ishrana = ishrana;

	}

	public String getVrstaZivotinje() {
		return vrstaZivotinje;
	}

	public void setVrstaZivotinje(String vrstaZivotinje) {
		this.vrstaZivotinje = vrstaZivotinje;
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getIshrana() {
		return ishrana;
	}

	public void setIshrana(String ishrana) {
		this.ishrana = ishrana;
	}

	public void stampanje() {
		System.out.println("U Zoo vrtu zive zivotinje: " + ime + "koje su vrste: " + vrstaZivotinje + " i hrane se: " + ishrana);
	}

}
