package gestionRessource;

import java.util.Date;

public abstract class Ressource implements Comparable<Ressource>{
	protected String path = "";
	protected Date date ;

	
	
	public Ressource(String path) {
		super();
		this.path = path;
		this.date = new Date();
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}
	
	
	@Override
	public int compareTo(Ressource o) {
		return this.date.compareTo(o.date);
	}

	@Override
	public String toString() {
		return "Ressource [path=" + path + ", date=" + date + "]";
	}
	
	

}
