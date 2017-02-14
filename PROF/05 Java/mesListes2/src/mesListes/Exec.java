package mesListes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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

		// methode 1
//		Collections.sort(l, new AgeComparator());
		Collections.sort(l, new NomComparator());

		for (Stagiaire stagiaire : l) {
			System.out.println(stagiaire);
		}

		// methode 2
		Collections.sort(l, new Comparator<Stagiaire>() {

			@Override
			public int compare(Stagiaire o1, Stagiaire o2) {
				// TODO Auto-generated method stub
				return o1.getAge().compareTo(o2.getAge());
			}
			
		});

		for (Stagiaire stagiaire : l) {
			System.out.println(stagiaire);
		}
	
		// methode 2
		Collections.sort(l,  (o1,o2) ->  o1.getAge().compareTo(o2.getAge()) );

		for (Stagiaire stagiaire : l) {
			System.out.println(stagiaire);
		}	
	}
	
	
	
	
	
	
	
	
	
	

}
