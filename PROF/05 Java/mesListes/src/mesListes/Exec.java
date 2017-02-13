package mesListes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Exec {

	public static void main(String[] args) {

		List<Stagiaire> l = new ArrayList<Stagiaire>();

		l.add(new Stagiaire("Dupont", "Jean", 45));
		l.add(new Stagiaire("Durant", "Louis", 65));
		l.add(new Stagiaire("Martin", "Kevin", 15));

		for (Stagiaire stagiaire : l) {
			System.out.println(stagiaire);
		}

		Collections.sort(l);

		for (Stagiaire stagiaire : l) {
			System.out.println(stagiaire);
		}
	}

}
