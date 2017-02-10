/**
 * 
 */
package commande.application;

import modele.bo.Article;
import modele.bo.Catalogue;
import modele.bo.Panier;
import modele.bo.Ramette;
import modele.bo.Stylo;

/**
 * @author 
 *
 */
public class AppliTestBO {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Article[] articles=null;
		try {
			//Constituer un tableau d'articles
			articles = new Article[20];
			
	        //********************************
	        // tester la gestion des articles
	        //********************************
			
			Stylo unBic = new Stylo("Bic", "BBOrange","Bic bille Orange", (float)1.2, 20, "Bleu");
			System.out.println("\nREM : Affichage d'un article Stylo 'Bic'");
			System.out.println(unBic.toString());
			System.out.println("---------------------------------------------------------------");
			Ramette uneRamette = new Ramette("Clairef", "CRA4S", "Ramette A4 Sup", (float)9, 20, 80);
			System.out.println("\nREM : Affichage d'un article Ramette 'Clairefontaine'");
			System.out.println(uneRamette.toString());
			System.out.println("---------------------------------------------------------------");
			
			// Ajout des articles au tableau. 
			articles[0] = unBic;
			articles[1] = uneRamette;
			
			articles[2] = new Stylo("Stypen", "PlumeS", "Stylo Plume Stypen", (float)5.5, 20, "jaune");
			articles[3] = new Stylo("Waterman", "WOBGreen", "Waterman Orion Bille vert",(float)5.5, 20, "vert");
			articles[4] = new Stylo("Parker", "PlumeP", "Stylo Plume Parker", (float)5.5, 5, "noir");
			
			System.out.println("\nREM : Affichage du catalogue");
			//charger les articles dans le catalogue
			Catalogue catalogue = new Catalogue(articles);
			System.out.println(catalogue.toString());		
			System.out.println("---------------------------------------------------------------");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		//******************
		//tester le Panier
		//******************
		Panier panier = new Panier();
		try {
			//à l'ajout d'une ligne dans le panier, le stock virtuel de l'article doit diminuer
			//On ne peut commander plus que ce qu'il y a dans le stock virtuel (PlusEnStockException)
			panier.addLigne(articles[0], 2);
			System.out.println("\nREM : Affichage de l'article de la premiere ligne du panier");
			System.out.println(panier.getLigne(0).getArticle());
			System.out.println("---------------------------------------------------------------");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.err.println("ERREUR : " + e.getMessage());
		}


		try {
			panier.addLigne(articles[1], 13);
			panier.addLigne(articles[2], 12);
			System.out.println("\nREM : Un article n'a pas une quantité suffisante en stock");
			//tester le dépassement de qté en stock (la ligne n'est pas ajoutée au panier)
			panier.addLigne(articles[3], 30);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.err.println("ERREUR : " + e.getMessage());
		}

		try {
			System.out.println("\nREM : Affichage du panier - Ajout");
			System.out.println(panier.toString());
			System.out.println("---------------------------------------------------------------");
			
			System.out.println("\nREM : Affichage du catalogue - Stock à jour");
			//on réaffiche le catalogue (les stocks sont à jour)
			Catalogue catalogue = new Catalogue(articles);
			System.out.println(catalogue.toString());		
			System.out.println("---------------------------------------------------------------");
		}  catch (Exception e) {
			// TODO Auto-generated catch block
			System.err.println("ERREUR : " + e.getMessage());
		}
		
		try {
			System.out.println("\nREM : Modification du panier");
			//modifier une ligne du panier
			panier.updateLigne(0, 3); // +1 de BBOrange
			panier.updateLigne(1, 12); // -1 de CRA4S
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.err.println("ERREUR : " + e.getMessage());
		}

		try {
			System.out.println("\nREM : Affichage du panier - Modification");
			System.out.println(panier.toString());
			System.out.println("---------------------------------------------------------------");
			
			System.out.println("\nREM : Affichage du catalogue - Stock à jour");
			//on réaffiche le catalogue (les stocks sont à jour)
			Catalogue catalogue = new Catalogue(articles);
			System.out.println(catalogue.toString());	
		}  catch (Exception e) {
			// TODO Auto-generated catch block
			System.err.println("ERREUR : " + e.getMessage());
		}		

	}
	

}
