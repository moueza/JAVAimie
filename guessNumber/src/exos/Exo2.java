package exos;

import java.util.Scanner;

public class Exo2 {
	public String reverse(String s) {
		return reverse(s.substring(1)) + s.substring(0, 0);

	}

	public static void main(String[] args) {
		boolean saisieRange = false;
		int nombreAdeviner = -10000;

		String s;
		while (!saisieRange) {
			Scanner input = new Scanner(System.in);
			System.out.println("Please enter a number as RANGE: ");
			s = input.next(); // getting a String value
			// range = Integer.parseInt(s);
			// saisieRange = true;

			/*
			 * reverse(s.substring(1)) + s.substring(0,0);
			 * System.out.println(initialS + right);
			 */
			StringBuffer sb = new StringBuffer();
			sb.append(s);
			sb.reverse();
			System.out.println(sb);
		}
	}
}
