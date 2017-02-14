package metier;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class PersonneUtil {

	public static Personne getPersonne(String nom, String prenom, String ddnInString, String profession) {
		Personne result = new Personne();
		result.setNom(nom.toUpperCase());
		result.setPrenom(prenom.toUpperCase());

		// Conversion de la date
		Date ddn = null;
		try {
			ddn = new SimpleDateFormat("dd/MM/yyyy").parse(ddnInString);
		} catch (ParseException e) {
			System.out.println("problème de format de date");
		}
		result.setDdn(ddn);

		result.setProfession(profession.toLowerCase());

		return result;
	}
}
