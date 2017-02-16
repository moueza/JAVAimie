package serialisation;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Lire {
	public static void main(final String argv[]) {

		ObjectInputStream ois = null;

		try {
			final FileInputStream fichier = new FileInputStream("personne.ser");
			ois = new ObjectInputStream(fichier);
			final Message personne = (Message) ois.readObject();
			System.out.println(personne);
		} catch (final java.io.IOException e) {
			e.printStackTrace();
		} catch (final ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				if (ois != null) {
					ois.close();
				}
			} catch (final IOException ex) {
				ex.printStackTrace();
			}
		}
	}

}
