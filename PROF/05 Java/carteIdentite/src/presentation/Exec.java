package presentation;

import java.util.Scanner;

import metier.Personne;
import metier.PersonneUtil;

public class Exec {

	public static void main(String[] args) {
		Personne p = saisie();
		affiche(p);
		
	}

	private static void affiche(Personne p) {
		System.out.println("--------------------------------------");
		System.out.println(" "+p.getNom()+" "+p.getPrenom()+" ");
		System.out.println(" "+p.getAge() +" ans");
		System.out.println(" "+p.getProfession());
	}

	private static Personne saisie() {
		Scanner sc = new Scanner(System.in); 

		// Récupération des données
		System.out.print("Votre nom : ");
		String nom = sc.nextLine();
		System.out.print("Votre prenom : ");
		String prenom = sc.nextLine();
		System.out.print("Votre date de naissance : ");
		String dtInString = sc.nextLine();
		System.out.print("Votre profession : ");
		String prof = sc.nextLine();

		// Vérification et conversion
		return PersonneUtil.getPersonne(nom, prenom, dtInString, prof);

	}

}
