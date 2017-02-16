package exec;

import java.util.List;

import gestionRessource.Fichier;
import gestionRessource.Image;
import gestionRessource.Ressource;
import gestionRessource.RessourceService;
import gestionRessource.Url;

public class Exec {
	public static void main(String[] args) throws InterruptedException {
		RessourceService rs = new RessourceService(); 
		
		saisie(rs); 
		
		traitement(rs);
			
		
	}

	private static void traitement(RessourceService rs) {
		List<Ressource> lst = rs.getAllResources(); 
		for (Ressource ressource : lst) {
			System.out.println(ressource);
		}
		
		System.out.println("------------------------");
		
		List<Ressource> lst2 = rs.getAllURLResources();
		for (Ressource ressource : lst2) {
			System.out.println(ressource);
		}
	}

	private static void saisie(RessourceService rs) throws InterruptedException {
		rs.addRessource(new Url("http://google.fr"));
		Thread.sleep(1000);
		rs.addRessource(new Url("www.lemonde.fr"));	
		Thread.sleep(1000);
		rs.addRessource(new Fichier("c:/coco/file.txt"));
		Thread.sleep(1000);
		rs.addRessource(new Image("c:/coco/file.jpg"));
	}
}
