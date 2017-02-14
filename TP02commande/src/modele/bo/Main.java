package modele.bo;

public class Main {
	public static void main(String[] args) {
		Article articlee = new Stylo("Stabilo", "74584g8h", "marque noir", (float) 1.5, "vert");
		Article[] articlesARRAY = new Article[1];
		articlesARRAY[0]=articlee;
		Catalogue cat = new Catalogue(articlesARRAY);
		System.out.println(cat.toString());
	}
}
