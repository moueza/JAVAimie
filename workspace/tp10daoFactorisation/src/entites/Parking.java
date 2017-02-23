package entites;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.swing.text.TableView;

public class Parking {
	String idParking;
	String lieu;
	String nom;
	List<Voiture> listVoitures;

	public List<Voiture> getListVoitures() {
		return listVoitures;
	}

	public void setListVoitures(List<Voiture> listVoitures) {
		this.listVoitures = listVoitures;
	}

	public Parking() {
	}

	public Parking(String idParking, String lieu, String nom) {
		super();
		this.idParking = idParking;
		this.lieu = lieu;
		this.nom = nom;
	}

	public String getNom() {
		return nom;
	}

	public String getIdParking() {
		return idParking;
	}

	public void setIdParking(String idParking) {
		this.idParking = idParking;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getLieu() {
		return lieu;
	}

	public void setLieu(String lieu) {
		this.lieu = lieu;
	}

	public void insertVoiture(Voiture voiture) {
		// TODO
		if(this.idemMarques()) throws
	}

	public Boolean idemMarques() {
		List<String> tableauDesMarques = new ArrayList<String>();

		for (Voiture voiture : this.getListVoitures()) {
			tableauDesMarques.add(voiture.getMarque());
		}

		// https://www.mkyong.com/java/how-to-convert-list-to-set-arraylist-to-hastset/
		Set<String> set = new HashSet<String>(tableauDesMarques);

		if (set.size() == listVoitures.size()) {
			return false;
		} else {
			return true;
		}
	}
}
