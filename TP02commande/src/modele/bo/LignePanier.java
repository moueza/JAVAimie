package modele.bo;

import java.util.ArrayList;

public class LignePanier extends Ligne {
	public LignePanier(Article articlee, int qtee) {
		super(articlee, qtee);
		//this.lignesPanier = new ArrayList<>();

	}

	public void setQte(int qte) {
		if (qte >= 0) {
			this.qte = qte;
			this.prix=this.getQte()*this.article.getPrixUnitaire();
			}
	}

	/**
	 * public Ligne(Article article,int qte){
	 * this.prix=qte*article.getPrixUnitaire(); }
	 */
}
