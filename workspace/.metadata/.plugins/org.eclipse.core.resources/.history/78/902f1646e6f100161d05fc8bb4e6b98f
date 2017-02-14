package myPack;

import java.util.ArrayList;
import java.util.List;

public class Exec2Etranger {
	List<Shapee> l = new ArrayList<Shapee>();

	double aireTotal;
	double perimTotal;

	public void maim() {
		aireTotal = perimTotal();
		perimTotal = aireTotal();
		System.out.println("perims=" + perimTotal());
		System.out.println("aires=" + aireTotal());

	}

	public double perimTotal() {
		double totalPerim = 0;
		for (Shapee r : this.l) {
			totalPerim += r.getPerim();
		}
		return totalPerim;
	}

	public double aireTotal() {
		double totalAire = 0;
		for (Shapee r : this.l) {
			totalAire += r.getAire();
		}
		return totalAire;

	}

	public static void main(String[] args) {
		Shapee r1 = new Rectangle(10., 5.);
		Shapee r2 = new Rectangle(100., 50.);
		Exec2Etranger e = new Exec2Etranger();
		e.l.add(r1);
		//e.l.add(r2);

		Shapee carre = new Carre(2.);
		Shapee cercle = new Cercle(10.);

		//e.l.add(carre);
		//e.l.add(cercle);
		Shapee dodecaedre = new Dodecaedre(2.);
		e.l.add(dodecaedre);

		e.maim();
	}
}
