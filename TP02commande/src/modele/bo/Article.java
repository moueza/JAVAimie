package modele.bo;

public abstract class Article {
	String reference;
	String marque;
	String designation;
	float prixUnitaire;
	int qteStock;

	public String getReference() {
		return reference;
	}

	public String getMarque() {
		return marque;
	}

	public String getDesignation() {
		return designation;
	}

	public float getPrixUnitaire() {
		return prixUnitaire;
	}

	public int getQteStock() {
		return qteStock;
	}

	protected void setReference(String reference) {
		this.reference = reference;
	}

	protected void setMarque(String marque) {
		this.marque = marque;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public void setPrixUnitaire(float prixUnitaire) {
		this.prixUnitaire = prixUnitaire;
	}

	public void setQteStock(int qte) {
		if (qte >= 0) {
			this.qteStock = qteStock;
		}
	}

	protected void entrerStock(int qte) {
		if (qte >= 0) {
		
		}
	}

	protected void sortirStock(int qte) {
		if (qte >= 0) {
			
		}
	}

	public String toString() {

		return "Designation=" + this.getDesignation() + " Marque=" + this.getMarque() + " PrixUnitaire="
				+ this.getPrixUnitaire() + " QteStock=" + this.getQteStock() + " Reference=" + this.getReference()
				+ "\n";

	}

}
