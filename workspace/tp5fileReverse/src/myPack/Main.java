package myPack;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class Main {
	protected String source;
	List<String> liste = new ArrayList<String>();

	public Main(String sourcee) {
		this.source = sourcee;
		lecture();
		affichageFromFile();
		reverse();
		ecriture();
		affichageFromFile();
	}

	private void ecriture() {
		try {

			PrintWriter fichier = new PrintWriter(new FileWriter("txt.txt"));
			for (String str : this.liste) {
				fichier.println(str);
			}
			fichier.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private void reverse() {
		Collections.reverse(this.liste);
	}

	public static void main(String[] args) {
		new Main("txt.txt");
	}

	private void affichageFromFile() {
		System.out.println("ds affichage from file");
		try {
			for (String s : this.liste) {
				System.out.println(s);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void lecture() {
		try {
			String ligne;
			BufferedReader fichier = new BufferedReader(new FileReader(this.source));

			while ((ligne = fichier.readLine()) != null) {
				System.out.println(ligne);
				liste.add(ligne);
			}
			fichier.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
