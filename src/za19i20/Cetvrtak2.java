package za19i20;

import java.util.Scanner;

public class Cetvrtak2 {

	public static void main(String[] args) {
/*
Napisati program koji ce imati infinite loop i stampati "Hello world!"
(Koristiti while petlju)		 */
		
		Scanner infinite = new Scanner(System.in);

		boolean i = true;

		while (i)
			System.out.println("Hello world!");

		infinite.close();
	}

}
