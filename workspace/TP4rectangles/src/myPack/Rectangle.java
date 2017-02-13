package myPack;

import java.util.Comparator;

public class Rectangle extends Shapee implements Comparator<Rectangle>, Calculable {
	Double longueur;
	Double largeur;

	public Rectangle() {

	}

	public Rectangle(Double longueur, Double largueur) throws NegativeException {
		super();
		if (longueur < 0) {
			throw new NegativeException();
		} else {
			this.longueur = longueur;
			this.largeur = largueur;
		}
	}

	public Double getLongueur() {
		return longueur;
	}

	public void setLongueur(Double doubleueur) throws NegativeException {
		if (doubleueur >= 0) {
			this.longueur = doubleueur;
		}else{
			throw new NegativeException();
		}
	}

	public Double getLargeur() {
		return largeur;
	}

	public void setLargeur(Double largeur) throws NegativeException {
		this.largeur = largeur;
	}

	@Override
	public String toString() {
		return "Rectangle [Doubleueur=" + longueur + ", largeur=" + largeur + "]";
	}

	public Double getPerim() {
		return 2 * (this.longueur + this.largeur);
	}

	public Double getAire() {
		System.out.println("in getAire");
		Double r = this.longueur * this.largeur;
		System.out.println("this.longueur=" + this.longueur + " largueur=" + this.largeur + " r=" + r);
		return r;
	}

	@Override
	public int compare(Rectangle o1, Rectangle o2) {
		return compare(o1, o2);
	}

}
