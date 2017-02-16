package gestionRessource;

import java.util.ArrayList;
import java.util.List;

public class RessourceServiceFake implements IRessourceService {

	@Override
	public void addRessource(Ressource ressource) {
		// je ne fais rien 
	}

	@Override
	public List<Ressource> getAllResources() {
		List<Ressource> fake = new ArrayList<Ressource>();
		fake.add((new Url("JE t'ai hacké")));
		return fake;
	}

	@Override
	public List<Ressource> getAllURLResources() {
		List<Ressource> fake = new ArrayList<Ressource>();
		fake.add((new Url("JE t'ai hacké")));
		return fake;
	}

}
