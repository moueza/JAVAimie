package gestionRessource;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RessourceService {
	
	private List<Ressource> lstRessources = new ArrayList<Ressource>();
	

	public void addRessource(Ressource ressource){
		lstRessources.add(ressource);
	}
	
	public List<Ressource> getAllResources(){
		
		Collections.sort(lstRessources);
		
		return lstRessources;
	}

	public List<Ressource> getAllURLResources(){
		List<Ressource> result = new ArrayList<Ressource>();
		Collections.sort(lstRessources);
		
		for (Ressource ressource : lstRessources) {
			if(ressource instanceof Url){
				result.add(ressource);
			}
		}
		return result;
	}

	
	
	
	
	
	
	
	
	
	
	

}
