package myPack;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Lire {
	public static void main(String[] args) {
		ObjectInputStream ois = null;

		FileInputStream fichier;
		try {
			fichier = new FileInputStream("serialisation.ser");
			ois = new ObjectInputStream(fichier);
			final Message message = (Message) ois.readObject();
			System.out.println(message);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			if (ois != null) {
				try {
					ois.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

	}
}
