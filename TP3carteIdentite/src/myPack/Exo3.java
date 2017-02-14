package myPack;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Exo3 {

	static String ddn = "";;
	static String t = "";
	static String prenom, nom, profession;

	public static void saisie() {
		
	
		StringBuffer s2 = new StringBuffer();
		boolean saisieMANUALDebug = false;
		if (saisieMANUALDebug) {
			System.out.println("Prenom");
			Scanner input = new Scanner(System.in);
			prenom = input.next(); // getting a String value

			input = new Scanner(System.in);
			System.out.println("Nom");
			nom = input.next(); // getting a String value

			input = new Scanner(System.in);
			System.out.println("Entrer date de naissance (comme 31/01/1996)");
			ddn = input.next(); // getting a String value
			// range = Integer.parseInt(s);
			// saisieRange = true;

			input = new Scanner(System.in);
			System.out.println("Nom");
			profession = input.next(); // getting a String value

		} else {

			prenom = "Emmanuel";
			nom = "MAlabry";
			ddn = "01/01/2000";
			profession = "charcutier";
		}

		Personne p =new Personne(prenom,nom,ddn,profession);
	}

	public static void traitement(){

		// DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");// "dd-MM/yyyy"
		Date startDate = new Date();
		try {
			startDate = df.parse(ddn);

			long currentTime = System.currentTimeMillis();
			Calendar now = Calendar.getInstance();
			now.setTimeInMillis(currentTime);// http://howtodoinjava.com/for-fun-only/java-code-to-calculate-age-from-date-of-birth/
			System.out.println("now Year=" + now.get(Calendar.YEAR));

			Calendar birth = Calendar.getInstance();
			birth.setTimeInMillis(startDate.getTime());

			// DateFormat df2= new SimpleDateFormat("dd-MM/yyyy");
			// String newDateString = df2.format(startDate);//
			// http://stackoverflow.com/questions/6510724/how-to-convert-java-string-to-date-object
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	 
	public static void affichage(){}

	
	public static void main(String[] args) {
		saisie();	
		traitement();
		affichage();
	}
}
