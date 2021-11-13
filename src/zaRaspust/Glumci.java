package zaRaspust;

import java.util.Scanner;

public class Glumci {

	/*
Napraviti klasu Glumci koja ce imati public atribute: Ime i prezime, godina rodjenja, pol. 

Private atributi su: da li su ozenjeni ili udati (boolean), prosecna zarada po filmu, broj snimljenih filmova.
	  
Potrebno je izracunati i odstampati sve atribute, koliko su ukupno zaradili u svim filmovima, koliko godina pune u 2022. godini,
ako su muskog pola preko atributa treba pre imena da se doda "Mr." ili "Mrs." ako su zenskog pola.

Nakon toga napraviti Array listu gde ce se ubaciti poslednjih 5 snimljenih filmova (pored naslova napisati ocenu sa imdb-a) i
odstampati od najbolje ocenjenog do najgore ocenjenog filma od tih pet (preko getera i setera).
	 */

	Scanner unos = new Scanner(System.in);

	public String firstName;
	public String lastName;
	public int dateOfBirth;
	public String gender;
	private boolean spouse;
	private double avrSalary;
	private int numOfFilms;
	public double netWorth;
	/*
	 * public Glumci(String ime, String prezime, int godinaRodjena, char pol) {
	 * this.ime = "Christian"; this.prezime = "Bale"; this.godinaRodjenja = 1974;
	 * this.gender = 'M'; }
	 */

	public Glumci() {

	}

	public void setspouse(boolean spouse) {
		this.spouse = true;
	}

	public boolean getspouse() {
		return this.spouse;
	}

	public void setAvrSalary(double avrSalary) {
		this.avrSalary = avrSalary;
	}

	public double getAvrSalary() {
		return this.avrSalary;
	}

	public void setnumOfFilms(int numOfFilms) {
		this.numOfFilms = numOfFilms;
	}

	public int getnumOfFilms() {
		return this.numOfFilms;
	}

	public double netWorth() {
		double netWorth = this.avrSalary * this.numOfFilms;
		return netWorth;
	}
	
	public int nextYearAge() {

		int nextYearAge = 2022 - this.dateOfBirth;
		return nextYearAge;
	}
	
	public void stampanje() {
		if (gender.equals("M")) {
			System.out.println("First Name: Mr. " + firstName + ";\nLast Name: " + lastName + ";\nBorn: " + dateOfBirth + "\nNext year will be " + nextYearAge() + " years old." + "\nMarried: "
					+ getspouse() + "\nAverage Salary: " + getAvrSalary() + "\nNumber of Films: "
					+ getnumOfFilms() + "\nNet Worth: " + netWorth());
		} else {

			System.out.println("First Name: Mrs. " + firstName + ";\nLast Name: " + lastName + ";\nBorn: " + dateOfBirth + "\nNext year will be " + nextYearAge() + " years old." + "\nMarried: "
					+ getspouse() + "\nAverage Salary: " + getAvrSalary() + "\nNumber of Films: "
					+ getnumOfFilms() + "\nNet Worth: " + netWorth());
		}
		
	}

}

