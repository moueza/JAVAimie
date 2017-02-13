package formes;

public class Cercle extends Forme{
	protected Integer rayon;
	
	public Cercle() {
	}

	public Cercle(Integer rayon) {
		super();
		this.rayon = rayon;
	}

	public Integer getRayon() {
		return rayon;
	}

	public void setRayon(Integer rayon) {
		this.rayon = rayon;
	}

	@Override
	public Integer getPerim() {
		return (int)(2 * Math.PI * rayon);
	}

	@Override
	public Integer getAire() {
		return (int)(Math.PI * rayon * rayon);
	}

	

}
