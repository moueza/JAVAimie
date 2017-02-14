package exos;

import java.util.Scanner;

public class Exo3 {
	/**TODO modulo*/
public static char  plus1(char c){
	int charI= ((int)c)+1;
	char charChar=(char)charI;
	return charChar;
}

	public static void main(String[] args) {
		boolean saisieRange = false;
		int nombreAdeviner = -10000;

		String s;
		StringBuffer s2 = new StringBuffer();
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
			
			
			for (int i = 0; i < s.length(); i++) {
				s2.append(plus1(s.charAt(i)));
			}
			
			System.out.println(s2);
		}
	}
}
