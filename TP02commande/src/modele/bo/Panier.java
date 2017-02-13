package modele.bo;

import java.util.ArrayList;

public class Panier {
	// ArrayList<LignePanier> lignesPanier = new ArrayList<>();
	LignePanier[] lignesPanier;
	int panierSize = 0;
	float montant;
	int indexLigne;

	public Panier() {

	}

	public float getMontant() {
		float total = 0;
		for (LignePanier lignePanier : lignesPanier) {
			total += lignePanier.getPrix();
		}
		return total;
	}

	/** commence a 0 */
	public LignePanier getLigne(int index) {
		return lignesPanier[index];
	}

	/** de 0 */
	public LignePanier[] getLignesPanier() {
		// LignePanier[] tablo = new LignePanier[lignesPanier.size()];
		// for (int i = 0; i < lignesPanier.size(); i++) {
		// tablo[i] = lignesPanier.get(i);
		// }
		return this.lignesPanier;
	}

	public void addLigne(Article article, int qte) {
		if (qte <= article.qteStock) {
			LignePanier lignePanier = new LignePanier(article, qte);

			/** recopie dans nouv tableau augmenté */
			LignePanier[] lignesPanierSov = new LignePanier[panierSize + 1];
			for (int i = 0; i < this.lignesPanier.length; i++) {
				lignesPanierSov[i] = this.getLigne(i);
			}

			/** ajout de la derniere ligne a ajouter */
			lignesPanierSov[this.lignesPanier.length + 1] = lignePanier;

			this.lignesPanier = null;
			this.lignesPanier = lignesPanierSov;/**
												 * on recupere le tableau
												 * augmenté
												 */
		}
	}

	public void updateLigne(int index, int newQte) {
		if (newQte <= this.getLigne(index).getQte()) {
			this.getLigne(index).setQte(newQte);
		}
	}

	public String toString() {
		String str = null;
		for (LignePanier lignePanier : lignesPanier) {
			str = lignePanier.toString();
		}
		return str;
	}

}
