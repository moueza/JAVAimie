package module;

import java.util.Date;

public abstract class Ressource {
	Date date ;

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public abstract String getRessource();
	//public abstract void getRessource(String name);
}
