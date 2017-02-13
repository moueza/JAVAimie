package guessNumber;

//Mastermind like
import java.util.Random;
import java.util.Scanner;

public class MagicNum {
	private float x;

	public int generate(int x) {
		Random random = new Random();
		// float rand = random.nextFloat();
		int rand = 1 + random.nextInt(x);
		return rand;
	}

	public static void main(String[] args) {
		Boolean trouve = false;
		Boolean saisie;
		MagicNum m = new MagicNum();
		int range = -1000;
		int proposition = -1000;
		String s;
		boolean out = false;
		int numberOfTrials = 0;
		int numberTrialsAuthorized = 5;
		boolean saisieRange = false;
		int nombreAdeviner = -10000;

		while (!saisieRange) {
			Scanner input = new Scanner(System.in);
			System.out.println("Please enter a number as RANGE: ");
			s = input.next(); // getting a String value
			range = Integer.parseInt(s);
			saisieRange = true;
			System.out.println("blb9");
		}
		System.out.println("blb10");

		nombreAdeviner = m.generate(range);
		System.out.println("blb20 nb a deviner=" + nombreAdeviner);
		while (!trouve && !out) {
			saisie = false;
			System.out.println("blb30");
			while (!saisie && !out) {
				System.out.println("blb40");
				Scanner input = new Scanner(System.in);
				System.out.println("Please enter a number GUESS PROPOSITION: ");
				s = input.next(); // getting a String value
				proposition = Integer.parseInt(s);
				numberOfTrials++;
				System.out.println("Nombre d'essais = " + numberOfTrials + " sur " + numberTrialsAuthorized);
				System.out.println("blb50");
				if (numberOfTrials == numberTrialsAuthorized) {
					System.out.println("\nPerdu");
					out = true;
				} else if (proposition == nombreAdeviner) {
					System.out.println("gagné");
					out = true;
				} else if (proposition < nombreAdeviner) {
					System.out.println("llb60 c est plus");
				} else if (proposition > nombreAdeviner) {
					System.out.println("llb61 c est moins");
				}

			}
		}

	}
}

/*
 * Creer une class guessNumber qui genere un nombre aleatoire de 1 a x qui
 * compare le resultat saisi au clavier et memorise le nombre de tent
 */