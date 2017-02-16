package gestionRessource;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RessourceService implements IRessourceService {
	// partie Singleton
	private static IRessourceService instance = null;
	
	public static IRessourceService getInstance(){
		if(instance==null){
			instance = new RessourceService();
//			instance = new RessourceServiceFake();
		}

		return instance;
	}
	
	
	private RessourceService(){
		
	}
	
	// partie métier
	
	private List<Ressource> lstRessources = new ArrayList<Ressource>();
	

	/* (non-Javadoc)
	 * @see gestionRessource.IRessourceService#addRessource(gestionRessource.Ressource)
	 */
	@Override
	public void addRessource(Ressource ressource){
		lstRessources.add(ressource);
	}
	
	/* (non-Javadoc)
	 * @see gestionRessource.IRessourceService#getAllResources()
	 */
	@Override
	public List<Ressource> getAllResources(){
		
		Collections.sort(lstRessources);
		
		return lstRessources;
	}

	/* (non-Javadoc)
	 * @see gestionRessource.IRessourceService#getAllURLResources()
	 */
	@Override
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
