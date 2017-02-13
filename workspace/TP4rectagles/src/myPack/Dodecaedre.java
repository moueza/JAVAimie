package myPack;

import java.awt.Shape;

public class Dodecaedre extends Shapee {
	Double cote;

	public Dodecaedre() {

	}

	public Double getCote() {
		return cote;
	}

	public void setCote(Double cote) {
		this.cote = cote;
	}

	public Dodecaedre(Double cote) {
		super();
		this.cote = cote;
	}

	@Override
	public String toString() {
		return "Dodecaedre [cote=" + cote + "]";
	}


}
