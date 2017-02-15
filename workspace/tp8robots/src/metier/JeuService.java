package metier;

import e.Case;
import e.Grille;
import e.IRobot;
import e.Robot;
import p.IExec;

public class JeuService implements IExec {

	IGrille iGrille;
	IRobot irobot;
	static JeuService instance;

	private Integer tour = 0;

	private JeuService() {
		iGrille = new Grille();
		irobot = new Robot();
	}
	
	public void gestionPartie()
	{
		initialisation();
		afficher(0);
		
		boolean nonFinis = true;
		while(nonFinis)
		{
			nonFinis = tour();
		}
	}

	// Initialisation de la grille
	public void initialisation() {
		Case[][] tmp_grille = new Case[3][3];
		for (Integer i = 0; i < 3; i++) {
			for (Integer a = 0; a < 3; a++) {
				tmp_grille[i][a] = Case.VIDE;
			}
		}
		iGrille.setGrille(tmp_grille);
	}

	public boolean tour() {
		boolean pasFin = true;

		irobot.jouerCoup();

		Integer stade = victoire();

		afficher(stade);
		tour++;

		if (stade == 1 || stade == 2)
			pasFin = false;

		return pasFin;
	}

	// Classe vérifiant si le jeu est finis
	// 0 -> Continuer jeu
	// 1 -> Egalité
	// 2 -> victoire
	public Integer victoire() {

		// Vérifie si il reste des cases libres
		if (tour == 10) {
			return 1;
		}
		return 0;
	}

	public void afficher(Integer stade) {
		switch (stade) {
		// Parie en cours
		case 0:
			Case[][] tmp_grille = new Case[3][3];
			tmp_grille = iGrille.getGrille();

			System.out.println("_______________");
			for (int i = 0; i < 3; i++) {
				for (int a = 0; a < 3; a++) {
					switch (tmp_grille[i][a]) {
					case VIDE:
						System.out.print("|   |");
						break;

					case ROND:
						System.out.print("| o |");
						break;

					case CROIX:
						System.out.print("| x |");
						break;
					}

				}
				System.out.println("\n");
				System.out.println("---------------");
			}
			System.out.println("\n");
			System.out.println("\n");
			break;

		// egalité
		case 1:
			System.out.println("Egalité");
			break;
		}
	}

	public static JeuService getInstance() {
		if (instance == null)
			instance = new JeuService();

		return instance;
	}

	public Case[][] getGrille() {
		return this.iGrille.getGrille();
	}

	public void setGrille(Case[][] tmp_grille) {
		this.iGrille.setGrille(tmp_grille);
	}

	@Override
	public void joueurA(String nom) {
		// TODO Auto-generated method stub

	}

	@Override
	public void joueurB(String nom) {
		// TODO Auto-generated method stub

	}

}
