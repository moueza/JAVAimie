package module;

import java.util.Date;

public class Fichier extends Ressource {
	private String name;

	public Fichier() {

	}

	public Fichier(String namee,Date datee) {
		this.name = namee;
	}

	@Override
	public String getRessource() {
		return this.name;
	}



}
