package myPack;

import java.util.Comparator;

public class Carre extends Rectangle {
	Double cote;

	public Carre(Double cote) throws NegativeException {
		super(cote, cote);
	}

}
