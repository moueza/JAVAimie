package formes;

public class Carre extends Rectangle{
	
	
	public Carre() {
	}

	public Carre(Integer cote){
		super(cote,cote);
	}
	
	public void setCote(Integer cote){
		this.largeur=cote;
		this.longueur=cote;
	}

	public Integer getCote(){
		return this.largeur;
	}
	
	
}
