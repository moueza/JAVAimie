package module;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class RessourceService {
	List<Ressource> ressourceList = new ArrayList<Ressource>();

	public void addRessource(Ressource ress) {
		this.ressourceList.add(ress);
	}

	public List<Ressource> getAllRessources() {
		List<Ressource> list = new ArrayList<Ressource>();
		for (Ressource ressource : ressourceList) {
			list.add(ressource);
		}
		return list;
	}

	public List<Url> getAllURL() {
		List<Url> list = new ArrayList<Url>();
		for (Ressource ressource : ressourceList) {
			if (ressource instanceof Url) {
				list.add((Url) ressource);
			}
		}
		Collections.sort(list, new Comparator<Ressource>() {
			@Override
			public int compare(Ressource o1, Ressource o2) {
				return o1.getDate().compareTo(o2.getDate());
			}
		});

		return list;
	}

}
