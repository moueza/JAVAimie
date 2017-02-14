package modele.bo;

public class Ramette extends Article {
	int grammage;

	public Ramette(String marque, String ref, String designation, float pu, int grammage) {
		if ((grammage >= 0)) {

		}
	}

	public Ramette(String marque, String ref, String designation, float pu, int qte, int grammage) {
		if ((qte >= 0) && (grammage >= 0)) {

		}
	}

	public int getGrammage() {
		return grammage;
	}

	public void setGrammage(int grammage) {
		if (grammage >= 0) {
			this.grammage = grammage;
		}
	}

	public String toString() {
		String str = null;
		str = "grammage=" + this.grammage;
		return str;
	}

}
