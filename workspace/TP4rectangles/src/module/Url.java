package module;

public class Url extends Ressource {
	private String name;

	public Url(String string) {
		this.name = string;
	}

	public void Url() {

	}

	public void Url(String namee) {
		this.name = namee;
	}

	@Override
	public String getRessource() {
		return this.name;

	}

}
