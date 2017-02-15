package myPack;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Ecrire {
	public static void main(String[] args) {
		ObjectOutputStream oos = null;
		FileOutputStream fichier;
		try {
			fichier = new FileOutputStream("serialisation.ser");
			oos = new ObjectOutputStream(fichier);
			Message m = new Message("Coucou");
			oos.writeObject(m);
			oos.flush();
			System.out.println("ecriture");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (oos != null) {
				try {
					oos.flush();
					oos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

	}
}
