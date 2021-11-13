package za06i07;

public class Stampanje {

	public static void main(String[] args) {
		
		Ribe ribe = new Ribe("kicmenjak", "slatkovodna riba", "komarac", "slatka", 6, "neka cudna vrsta peraja.");
		Sisari sisari = new Sisari("kicmenjak", "lisica", "kokoska", "crvena", "divlja", "mesojed.");
		
		String[] spisakZivotinja = {"Zivotinja; ", "Zver; ", "Zmaj!"};
		Staniste staniste = new Staniste(" ", " ", " ", spisakZivotinja, "Cudno staniste");
	
		
		ribe.stampanje();
		System.out.println("");
		sisari.stampanje();
		sisari.setBojaDlake("BELA");
		System.out.println("");
		sisari.stampanje();
		System.out.println("");
		staniste.stampanje();
	}
}