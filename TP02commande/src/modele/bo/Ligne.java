package modele.bo;

import java.util.ArrayList;

public abstract class Ligne {
	Article article;
	ArrayList<LignePanier> lignesPanier;
	protected int qte;
	protected float prix;/**TODO calcul*/

	/**TODO*/
	public Ligne(Article article,int qte){
		if (qte >= 0) {
			this.prix=qte*article.getPrixUnitaire();
		
		}	}
	
	public Article getArticle() {
		return this.article;
			}

	public int getQte() {
		return qte;
	}

	public float getPrix() {
		return prix;
	}

	protected void setArticle(Article article) {

	}

	abstract protected  void setQte(int qte);

	public String toString() {
		return "Article="+this.getArticle().toString()+"Quantite="+this.getQte()+" prix="+this.getPrix()+"\n";

	}

}
