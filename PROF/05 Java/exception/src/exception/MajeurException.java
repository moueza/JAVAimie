package exception;

public class MajeurException extends Exception {

	@Override
	public String getMessage() {
		return "Conversion imposssible de l'age";
	}
}
