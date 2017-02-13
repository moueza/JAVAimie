package metier;

import java.util.Calendar;
import java.util.Date;

public class Personne {
	private String nom;
	private String prenom;
	private Date ddn;
	private String profession;
	
	public Personne() {
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public Date getDdn() {
		return ddn;
	}

	public void setDdn(Date ddn) {
		this.ddn = ddn;
	}

	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

	public Integer getAge() {
		Calendar curr = Calendar.getInstance();
		Calendar birth = Calendar.getInstance();
		birth.setTime(ddn);
		return (curr.get(Calendar.YEAR) - birth.get(Calendar.YEAR));
	}
	
	
}
