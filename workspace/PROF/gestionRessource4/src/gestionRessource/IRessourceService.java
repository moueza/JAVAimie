package gestionRessource;

import java.util.List;

public interface IRessourceService {

	public void addRessource(Ressource ressource);

	public List<Ressource> getAllResources();

	public List<Ressource> getAllURLResources();

}