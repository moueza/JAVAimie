package myPack;

import java.awt.Shape;
import java.util.ArrayList;
import java.util.List;

import module.Fichier;
import module.Ressource;
import module.RessourceService;
import module.Url;

public class Exec {
	List<Shapee> l = new ArrayList<Shapee>();

	public List<Shapee> getL() {
		return l;
	}

	public void setL(List<Shapee> l) {
		this.l = l;
	}

	public double getAireTotal() {
		return aireTotal;
	}

	public void setAireTotal(double aireTotal) {
		this.aireTotal = aireTotal;
	}

	public double getPerimTotal() {
		return perimTotal;
	}

	public void setPerimTotal(double perimTotal) {
		this.perimTotal = perimTotal;
	}

	double aireTotal;
	double perimTotal;

	public void maim() {
		for (Shapee shapee : this.l) {
			if (shapee instanceof Calculable) {
				this.aireTotal += ((Calculable) shapee).getAire();
				this.perimTotal += ((Calculable) shapee).getPerim();

			}
		}

		System.out.println("perims=" + this.getPerimTotal());
		System.out.println("aires=" + this.getAireTotal());

	}

	// public double perimTotal() {
	// double totalPerim = 0;
	// for (Shapee r : this.l) {
	// totalPerim += r.getPerim();
	// }
	// return totalPerim;
	// }
	//
	// public double aireTotal() {
	// double totalAire = 0;
	// for (Shapee r : this.l) {
	// totalAire += r.getAire();
	// }
	// return totalAire;
	//
	// }

	public static void main(String[] args) {
		try {
			Shapee r1 = new Rectangle(10., 5.);
//			Shapee r2 = new Rectangle(100., 50.);
//
//			Exec e = new Exec();
//			e.l.add(r1);
//			// e.l.add(r2);
//			e.maim();
//			
//			
//			Shapee rNug = new Rectangle(-10., 50.);
			Shapee carre = new Carre(2.);
		} catch (NegativeException e) {
			System.out.println(e.getMessage());
		}

		
		Shapee cercle = new Cercle(10.);

		// e.l.add(carre);
		// e.l.add(cercle);
		// Shapee dodecaedre = new Dodecaedre(2.);

	
		RessourceService rs= new RessourceService();
		rs.addRessource(new Fichier("liste.txt"));
		rs.addRessource(new Url("http://www.free.fr"));
		
		lister
		
	}
}
