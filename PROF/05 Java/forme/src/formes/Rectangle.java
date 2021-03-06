package formes;

public class Rectangle {
	private Integer longueur;
	private Integer largeur;
	
	public Rectangle() {
	}

	public Rectangle(Integer longueur, Integer largeur) {
		super();
		this.longueur = longueur;
		this.largeur = largeur;
	}
	
	public Integer getPerim(){
		return this.longueur*2 +this.largeur*2;
	}
	
	public Integer getAire(){
		return this.largeur * this.longueur;
	}

	public Integer getLongueur() {
		return longueur;
	}

	public void setLongueur(Integer longueur) {
		this.longueur = longueur;
	}

	public Integer getLargeur() {
		return largeur;
	}

	public void setLargeur(Integer largeur) {
		this.largeur = largeur;
	}

	
	
	
}
