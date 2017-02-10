package exos;

import java.util.Scanner;

public class Exo1 {
	public static void main(String[] args) {
		boolean saisieRange = false;
		int nombreAdeviner = -10000;
		int range = -1000;
		String s;
		while (!saisieRange) {
			Scanner input = new Scanner(System.in);
			System.out.println("Please enter a number as RANGE: ");
			s = input.next(); // getting a String value
			// range = Integer.parseInt(s);
			// saisieRange = true;
			char initial = s.charAt(0);
			String initialS = initial+"";
			initialS=initialS.toUpperCase();
			String right = s.substring(1);
			System.out.println(initialS + right);
		}
	}
}
