package exos;

import java.util.Scanner;

public class Exo4 {

	public static char sumChar(char c, char d) {
		int cc=(int)c;
		System.out.println("cc="+cc);
		int asciiCte = 96;
		
		//TODO to test
		int charI = (((int) (c-asciiCte) + (int) (d-asciiCte))%26+asciiCte);
		char charChar = (char) charI;
		System.out.println("c="+c+" d="+d+" charI="+charI+" ");
		return charChar;
	}

	public static void main(String[] args) {
		boolean saisieRange = false;
		int nombreAdeviner = -10000;

		String s, t;
		StringBuffer s2 = new StringBuffer();
		while (!saisieRange) {
			Scanner input = new Scanner(System.in);
			System.out.println("Please enter a number as RANGE: ");
			s = input.next(); // getting a String value
			// range = Integer.parseInt(s);
			// saisieRange = true;
			System.out.println("Please enter a number as RANGE: ");
			t = input.next();
			/*
			 * reverse(s.substring(1)) + s.substring(0,0);
			 * System.out.println(initialS + right);
			 */

			int maxSize = Math.max(s.length(), t.length());

			for (int i = 0; i < maxSize; i++) {
				char charNew = sumChar(s.charAt(i), t.charAt(i));
				System.out.println("i=" + i + "..charNew=" + charNew);
				s2.append(charNew);
			}

			System.out.println(s2);
		}
	}
}
