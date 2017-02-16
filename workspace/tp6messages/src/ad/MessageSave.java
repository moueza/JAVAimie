package ad;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import entite.Message;
import metier.IMAD;

public class MessageSave implements IMAD {
	String filename;
	Message message;

	public MessageSave() {

	}

	public MessageSave(Message message) {
		this.message = message;
	}

	@Override
	public void save() {
		ObjectOutputStream oos = null;

		try {
			final FileOutputStream fichier = new FileOutputStream("message.ser");
			oos = new ObjectOutputStream(fichier);
			// Personne p = new Personne("Dupont", "Jean", "Dupont", "123456");

			oos.writeObject(this.message);
			oos.flush();
			System.out.println("MessageSave lbl45 Ecriture de " + this.message);
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

	@Override
	public Message restore() {

		ObjectInputStream ois = null;
		// final Message messag=null;
		Message messag=null;
		try {	
			
			final FileInputStream fichier = new FileInputStream("message.ser");
			ois = new ObjectInputStream(fichier);
			messag = (Message) ois.readObject();
			System.out.println(messag);
			return messag;

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
		return messag;

	}

}
