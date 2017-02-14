package myPack;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Exo2 {
	public static void main(String[] args) {
		boolean saisieRange = false;
		int nombreAdeviner = -10000;

		String s, t;
		StringBuffer s2 = new StringBuffer();
		while (!saisieRange) {
			Scanner input = new Scanner(System.in);
			System.out.println("Enter a date (comme 31/01/1996)");
			s = input.next(); // getting a String value
			// range = Integer.parseInt(s);
			// saisieRange = true;

			// DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
			DateFormat df = new SimpleDateFormat("dd/MM/yyyy");//"dd-MM/yyyy"
			Date startDate = new Date();
			try {
				startDate = df.parse(s);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			DateFormat df2= new SimpleDateFormat("dd-MM/yyyy");
			String newDateString = df2.format(startDate);// http://stackoverflow.com/questions/6510724/how-to-convert-java-string-to-date-object
			System.out.println(newDateString);

		}
	}
}
