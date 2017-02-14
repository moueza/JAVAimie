package modele.bo;

import java.util.ArrayList;

public class Catalogue {
	// ArrayList<Article> articlesAuCatalogue = new ArrayList<>();
	Article[] articlesAuCatalogue;

	public Catalogue(Article[] articles) {
		if (articles[0] == null) {
			System.out.println("lbl5010 articles is null");
		} else {
			System.out.println("lbl5013 articles 0=" + articles[0].getDesignation());

			this.articlesAuCatalogue = new Article[articles.length];
			// Article[] tablo = new Article[articlesAuCatalogue.size()];// =
			// // Article[this.articlesAuCatalogue.size()];
			// for (int i = 0; i < articlesAuCatalogue.size(); i++) {
			// tablo[i] = articlesAuCatalogue.get(i);
			// }
			this.articlesAuCatalogue = articles;
			System.out.println("lbl5003 article 0=" + this.getArticlesAuCatalogue()[0].getDesignation());
		}
	}

	Article[] getArticlesAuCatalogue() {
		// Article[] tablo = new Article[articlesAuCatalogue.size()];// =
		// // Article[this.articlesAuCatalogue.size()];
		// for (int i = 0; i < articlesAuCatalogue.size(); i++) {
		// tablo[i] = articlesAuCatalogue.get(i);
		// }
		// return tablo;
		return articlesAuCatalogue;
	}

	public String toString() {
		if (articlesAuCatalogue != null) {
			if (articlesAuCatalogue[0] != null) {
				System.out.println("lbl792408 articlesAuCatalogue[0]="+articlesAuCatalogue[0].designation);
				String chn = "";
				for (Article article : articlesAuCatalogue) {
					System.out.println("lbl792410 design=" + article.getDesignation());
					chn = /** chn + */
							"Designation=" + article.getDesignation();// + "
																		// Marque="
																		// +
																		// article.getMarque()
																		// + "
																		// PrixUnitaire="
					// + article.getPrixUnitaire() + " QteStock=" +
					// article.getQteStock() + " Reference="
					// + article.getReference() + "\n";
					//

				}
				return chn;
			} else {
				System.out.println("lbl792415 articlesAuCatalogue[0] == null");
				return null;
			}

		} else {
			System.out.println("lbl792418 articlesAuCatalogue NULL");
			return null;
		}
	}
}
