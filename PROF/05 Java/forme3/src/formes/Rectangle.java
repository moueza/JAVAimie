package formes;

public class Rectangle extends Forme{
	protected Integer longueur;
	protected Integer largeur;
	
	public Rectangle() {
	}

	public Rectangle(Integer longueur, Integer largeur) {
		super();
		this.longueur = longueur;
		this.largeur = largeur;
	}
	
	@Override
	public Integer getPerim(){
		return this.longueur*2 +this.largeur*2;
	}
	
	@Override
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
