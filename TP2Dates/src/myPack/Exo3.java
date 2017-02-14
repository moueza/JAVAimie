package myPack;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Exo3 {
	public static void main(String[] args) {
		boolean saisieRange = false;
		int nombreAdeviner = -10000;

		String s, t;
		StringBuffer s2 = new StringBuffer();
		while (!saisieRange) {
			Scanner input = new Scanner(System.in);
			System.out.println("Entrer date de naissance (comme 31/01/1996)");
			s = input.next(); // getting a String value
			// range = Integer.parseInt(s);
			// saisieRange = true;

			// DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
			DateFormat df = new SimpleDateFormat("dd/MM/yyyy");// "dd-MM/yyyy"
			Date startDate = new Date();
			try {
				startDate = df.parse(s);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			// DateFormat df2= new SimpleDateFormat("dd-MM/yyyy");
			// String newDateString = df2.format(startDate);//
			// http://stackoverflow.com/questions/6510724/how-to-convert-java-string-to-date-object

			long currentTime = System.currentTimeMillis();
			Calendar now = Calendar.getInstance();
			now.setTimeInMillis(currentTime);// http://howtodoinjava.com/for-fun-only/java-code-to-calculate-age-from-date-of-birth/
			System.out.println("now Year=" + now.get(Calendar.YEAR));

			Calendar birth = Calendar.getInstance();
			birth.setTimeInMillis(startDate.getTime());
			System.out.println("birth Year=" + birth.get(Calendar.YEAR));
			
			System.out.println("Vous avez"+(now.get(Calendar.YEAR)-birth.get(Calendar.YEAR)));

			System.out.println("En decimal, Vous avez"+(float)(now.getTimeInMillis()-birth.getTimeInMillis())/(1000*3600*24*365));

			
			
			
		
			
			
			
			
			
			long currentTime = System.currentTimeMillis();
			Date now = Calendar.getInstance();
			now.setTimeInMillis(currentTime);// http://howtodoinjava.com/for-fun-only/java-code-to-calculate-age-from-date-of-birth/
			System.out.println("now Year=" + now.get(Calendar.YEAR));

			Calendar birth = Calendar.getInstance();
			birth.setTimeInMillis(startDate.getTime());
			System.out.println("birth Year=" + birth.get(Calendar.YEAR));
			
			System.out.println("Vous avez"+(now.get(Calendar.YEAR)-birth.get(Calendar.YEAR)));

			System.out.println("En decimal, Vous avez"+(float)(now.getTimeInMillis()-birth.getTimeInMillis())/(1000*3600*24*365));

			
			
		}
	}
}
