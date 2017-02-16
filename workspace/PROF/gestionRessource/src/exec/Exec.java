package exec;

import java.util.List;

import gestionRessource.Fichier;
import gestionRessource.Image;
import gestionRessource.Ressource;
import gestionRessource.RessourceService;
import gestionRessource.Url;

public class Exec {
	public static void main(String[] args) throws InterruptedException {
		
		RessourceService.addRessource(new Url("http://google.fr"));
		Thread.sleep(1000);
		RessourceService.addRessource(new Url("www.lemonde.fr"));	
		Thread.sleep(1000);
		RessourceService.addRessource(new Fichier("c:/coco/file.txt"));
		Thread.sleep(1000);
		RessourceService.addRessource(new Image("c:/coco/file.jpg"));
		
		List<Ressource> lst = RessourceService.getAllResources(); 
		for (Ressource ressource : lst) {
			System.out.println(ressource);
		}
		
		System.out.println("------------------------");
		
		List<Ressource> lst2 = RessourceService.getAllURLResources();
		for (Ressource ressource : lst2) {
			System.out.println(ressource);
		}
			
		
	}
}
