package formes;

import java.util.ArrayList;
import java.util.List;

public class Exec {

	public static void main(String[] args) {
		List<Forme> lst = new ArrayList<Forme>();
		
		saisie(lst);
				
		traitement(lst);
	}

	private static void saisie(List<Forme> lst) {
		lst.add(new Rectangle(3,2));
		lst.add(new Rectangle(3,5));
		lst.add(new Cercle(3));
		lst.add(new Carre(2));
		lst.add(new Carre(4));
		lst.add(new Carre(5));
	}

	private static void traitement(List<Forme> lst) {
		Integer perimCarreTotal=0;
		Integer perimTotal = 0;
		Integer aireTotal = 0;
		for (Forme forme : lst) {
			perimTotal+=forme.getPerim();
			aireTotal+=forme.getAire();
			if(forme instanceof Carre){
				perimCarreTotal+=forme.getPerim();
				System.out.println(((Carre) forme).getCote());
			}
			
		}
		System.out.println("Le périmètre total de mes carrés est :"+perimCarreTotal);
		System.out.println("Le périmètre total est :"+perimTotal);
		System.out.println("L'air total est :"+aireTotal);
	}
	
	
	
	

}
