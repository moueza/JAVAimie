package tp1Strings;

import java.util.Scanner;

public class Exo15palindromeIs {

	public static void main(String[] args) {
		StringBuilder s = new StringBuilder();
		StringBuilder s2 = new StringBuilder();
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a number as RANGE: ");
		s.append(input.next()); // getting a String value
		s2 = s;
		s2.reverse();
		if (s.equals(s2)) {

			System.out.println("is a palindrome");
		} else {
			System.out.println("is NOT a palindrome");
		}
	}
}
