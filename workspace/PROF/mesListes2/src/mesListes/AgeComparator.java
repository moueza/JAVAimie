package mesListes;

import java.util.Comparator;

public class AgeComparator implements Comparator<Stagiaire> {

	@Override
	public int compare(Stagiaire o1, Stagiaire o2) {
		return o1.getAge().compareTo(o2.getAge());
	}

}
