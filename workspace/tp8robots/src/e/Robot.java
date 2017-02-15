package e;

import metier.JeuService;

public class Robot implements IRobot {
	String nom;
	EnumJoueur numJoueur;

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public EnumJoueur getNumJoueur() {
		return numJoueur;
	}

	public void setNumJoueur(EnumJoueur numJoueur) {
		this.numJoueur = numJoueur;
	}

	// Jouageation du coup par le bot
	// Ps il est très con
	public void jouerCoup() {
		Case[][] tmp_grille = new Case[3][3];
		tmp_grille = JeuService.getInstance().getGrille();

		boolean ajoutCase = true;

		for (Integer i = 0; i < 3; i++) {
			for (Integer a = 0; a < 3; a++) {
				if (tmp_grille[i][a] == Case.VIDE && ajoutCase) {
					if (numJoueur == EnumJoueur.JOUEUR_A) {
						tmp_grille[i][a] = Case.ROND;
					} else {
						tmp_grille[i][a] = Case.CROIX;
					}

					ajoutCase = false;
				}
			}
		}
		JeuService.getInstance().setGrille(tmp_grille);
	}

	@Override
	public void donnerNom() {
		// TODO Auto-generated method stub

	}
}
