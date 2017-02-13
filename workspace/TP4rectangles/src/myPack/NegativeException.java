package myPack;

public class NegativeException extends Exception {
	@Override
	public String getMessage() {
		return "Erreur insertion nombre negatif";
	}
}
