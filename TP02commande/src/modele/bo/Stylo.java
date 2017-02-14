package modele.bo;

public class Stylo extends Article {
	String couleur;

	public Stylo(String marque, String ref, String designation, float pu, String couleur) {
	this.marque=marque;
	this.reference=ref;
	this.designation=ref;
	this.prixUnitaire=pu;
	this.couleur=couleur;
	}

	public Stylo(String marque, String ref, String designation, float pu, int qte, String couleur) {
	if (qte>=0){
		this.marque=marque;
		this.reference=ref;
		this.designation=ref;
		this.prixUnitaire=pu;
		this.setQteStock(qte);
		this.couleur=couleur;	
	}
		}

	public String getCouleur() {
		return couleur;
	}

	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}

	public String toString() {
		String str;
		str = "Couleur=" + this.getCouleur();
		return str;
	}
}
