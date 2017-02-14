package mesListes;

import java.util.Comparator;

public class NomComparator implements Comparator<Stagiaire>{

	@Override
	public int compare(Stagiaire o1, Stagiaire o2) {
		return o1.getNom().compareTo(o2.getNom());
	}
	
	
	
}
