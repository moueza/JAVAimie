package entite;

import java.util.List;
//move
public interface IPM {
	List<Message> getMessages();
	public void addMessage(Message m) ;
	public void saveMessage();

}
