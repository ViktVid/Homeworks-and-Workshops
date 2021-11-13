package za06i07;

public class Sisari extends ZooVrt {

	private String bojaDlake;
	private String covekovaPodela;
	private String nacinIshrane;

	public Sisari(String vrstaZivotinje, String ime, String ishrana, String bojaDlake, String covekovaPodela,
			String nacinIshrane) {
		super(vrstaZivotinje, ime, ishrana);

		this.bojaDlake = bojaDlake;
		this.covekovaPodela = covekovaPodela;
		this.nacinIshrane = nacinIshrane;

	}

	public String getBojaDlake() {
		return bojaDlake;
	}

	public void setBojaDlake(String bojaDlake) {
		this.bojaDlake = bojaDlake;
	}

	public String getCovekovaPodela() {
		return covekovaPodela;
	}

	public void setCovekovaPodela(String covekovaPodela) {
		this.covekovaPodela = covekovaPodela;
	}

	public String getNacinIshrane() {
		return nacinIshrane;
	}

	public void setNacinIshrane(String nacinIshrane) {
		this.nacinIshrane = nacinIshrane;
	}

	public void stampanje() {
		System.out.println("Ova zivotinja je " + getVrstaZivotinje() + ", zove se " + getIme()
				+ " i mislimo da joj je omiljena hrana " + getIshrana() + "." + " Boja dlake joj je " + getBojaDlake()
				+ ", a ljudi kazu da je " + getCovekovaPodela() + ". Svakako je " + getNacinIshrane());
	}

}
