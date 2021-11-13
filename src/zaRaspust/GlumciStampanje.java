package zaRaspust;

import java.util.ArrayList;

import zaRaspust.Glumci;

public class GlumciStampanje {

	public static void main(String[] args) {

		Glumci glumac = new Glumci();

		glumac.firstName = "Christian";
		glumac.lastName = "Bale";
		glumac.dateOfBirth = 1974;
		glumac.gender = "M";
		glumac.setspouse(true);
		glumac.setnumOfFilms(55);
		glumac.setAvrSalary(327.272);

		glumac.stampanje();

		System.out.println("Some Bale's popular movies: ");
		ArrayList<String> Film = new ArrayList<String>();
		Film.add("The Machinist (7.7)");
		Film.add("American Psycho (7.6)");
		Film.add("The Prestige (8.5)");
		Film.add("3:10 to Yuma (7.7)");
		Film.add("The Fighter (7.8)"); 

		Object alt = Film.get(0);
		
		Film.set(0, Film.get(2));
		Film.set(2, (String) alt);
		
		alt = Film.get(1);
		Film.set(1, Film.get(4));
		Film.set(4, (String) alt);
		
		alt = Film.get(3);		
		Film.set(3, Film.get(2));
		Film.set(2, (String) alt);
		
		alt = Film.get(2);
		Film.set(2, Film.get(3));		
		Film.set(3, (String) alt);
		
		for (int i = 0; i < Film.size(); i++) {

			System.out.println(Film.get(i));

		}
	}

}
