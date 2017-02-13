package formes;

import java.util.ArrayList;
import java.util.List;

public class Exec {

	public static void main(String[] args) {
		List<Rectangle> lst = new ArrayList<Rectangle>();
		
		lst.add(new Rectangle(3,2));
		lst.add(new Rectangle(3,5));
		lst.add(new Rectangle(2,7));
		lst.add(new Carre(4));
		lst.add(new Carre(5));
		
		Integer perimCarreTotal=0;
		Integer perimTotal = 0;
		Integer aireTotal = 0;
		for (Rectangle rectangle : lst) {
			perimTotal+=rectangle.getPerim();
			aireTotal+=rectangle.getAire();
			if(rectangle instanceof Carre){
				perimCarreTotal+=rectangle.getPerim();
				System.out.println(((Carre) rectangle).getCote());
			}
			
		}
		System.out.println("Le périmètre total de mes carrés est :"+perimCarreTotal);
		System.out.println("Le périmètre total est :"+perimTotal);
		System.out.println("L'air total est :"+aireTotal);
	}
	
	
	
	

}
