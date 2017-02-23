package metier;

import java.util.ArrayList;
import java.util.List;

import ad.MessageSave;
import entite.IPM;
import entite.Message;

public class MessageService implements IPM {
	List<Message> liste = new ArrayList<Message>();
	Message message;

	// MessageSave ms ;	////'IMAD interface+++
	MessageSave ms ;
	public MessageService() {
		super();
		MessageSave ms = new MessageSave();
	}
	
	
	public MessageService(Message message) {
		super();
		this.message = message;
		this.ms=new MessageSave();
	
	}

	
	
	public List<Message> getMessages() {
		return this.liste;
	}

	public void addMessage(Message m) {
		this.liste.add(m);
	}

	public void saveMessage() {
				this.ms.save();
	}

	public void printMessages() {
		for(Message mes: this.liste){
			System.out.println(mes);
		}
		
	}


	public void retrieveMessage() {
		this.message=ms.restore();
		
	}
	
	public void retrieveMessages() {
		
		
	}
	
	

}
