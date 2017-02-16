package entites;

import ad.ParkingDAO;

//Voiture est le maitre de la relation Voiture-Parking
public class Voiture {
	String nom;
	String marque;

	String parkingId;// eventuellement

	public Voiture() {
		super();
	}

	public Voiture(String nom, String marque) {
		super();
		this.nom = nom;
		this.marque = marque;
	}

	public String getNom() {
		return nom;
	}

	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	@Override
	public String toString() {
		return "Voiture [nom=" + nom + ", getNom()=" + getNom() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}

	public void insertToParking(Parking parking) {
		ParkingDAO.getInstance().insertToParking(parking);
		//ParkingDAO.getInstance().insertToParking(p11);

	}

}
