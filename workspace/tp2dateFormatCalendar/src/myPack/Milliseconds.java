package myPack;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Milliseconds {

	public static void main(String[] args) {
		// http://www.java2s.com/Tutorial/Java/0040__Data-Type/SimpleDateFormat.htm
		String pattern = "dd/MM/yyyy";
		DateFormat format = new SimpleDateFormat(pattern);// http://www.java2s.com/Tutorial/Java/0040__Data-Type/SimpleDateFormat.htm

		try {
			Date date = format.parse("22/11/2006");
			System.out.println(date);

			// formatting
			System.out.println(format.format(date));

			SimpleDateFormat format2 = new SimpleDateFormat("dd-MM/yyyy");// http://www.java2s.com/Tutorial/Java/0040__Data-Type/SimpleDateFormat.htm

			System.out.println(format2.format(date));
			
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}
