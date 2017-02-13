package exception;

public class Exec {

	public static void main(String[] args) {

		boolean res=false;
		try {
			res = isMajeur(-1);
		} catch (MajeurException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println(res);
	}

	private static boolean isMajeur(int i) throws MajeurException {
		if(i<0){
			throw new MajeurException();
		}
		
		if(i>18){
			return true;
		}
		else{
			return false;
		}
		
	}



}
