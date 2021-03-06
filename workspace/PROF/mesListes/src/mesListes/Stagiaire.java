package mesListes;

public class Stagiaire implements Comparable<Stagiaire>{
	private String nom;
	private String prenom;
	private Integer age;
	
	public Stagiaire() {
	}

	public Stagiaire(String nom, String prenom, Integer age) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Stagiaire [nom=" + nom + ", prenom=" + prenom + ", age=" + age + "]";
	}

	@Override
	public int compareTo(Stagiaire o) {
		return this.age.compareTo(o.age);
	}

	
	
}
