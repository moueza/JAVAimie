package presentation;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import entite.IPM;
import entite.Message;
import metier.MessageService;

public class Exec {
	public void saisie() {
	}

	public static void main(String[] args) {

		boolean autoMessage = true;
		Exec exec = new Exec();
		
		String pattern = "dd/MM/yyyy";
		DateFormat format = new SimpleDateFormat(pattern);// http://www.java2s.com/Tutorial/Java/0040__Data-Type/SimpleDateFormat.htm
		try {
			Date date= format.parse("22/11/2006");
			Message msg = new Message("Mon 1er message", date);
			IPM ms = new MessageService(msg);
			ms.saveMessage();
			ms.printMessages();
			ms.retrieveMessage();
			//ms.retrieveMessages();
		} catch (ParseException e) {
			e.printStackTrace();
		}
			
	
		
	}


}
