package serialisation;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Ecrire {

	public static void main(String[] args) {
		ObjectOutputStream oos = null;

		try {
			final FileOutputStream fichier = new FileOutputStream("personne.ser");
			oos = new ObjectOutputStream(fichier);
			Message p = new Message("Dupont", "Jean", "Dupont", "123456");
			oos.writeObject(p);
			oos.flush();
			System.out.println("Ecriture de " + p);
		} catch (final java.io.IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (oos != null) {
					oos.flush();
					oos.close();
				}
			} catch (final IOException ex) {
				ex.printStackTrace();
			}
		}

	}

}
