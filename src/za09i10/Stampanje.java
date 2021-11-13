package za09i10;

public class Stampanje {

	public static void main(String[] args) {
		Vozac v1 = new Vozac("Mile Pavko", "Sofer" );
		System.out.println(v1);
        Putnik p1 = new Putnik("Dragan Koja", 1000);
        System.out.println(p1);
        Autobus a1 = new Autobus ("Lasta", 500, v1, p1);
        System.out.println(a1);
	}

}
