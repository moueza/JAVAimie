package myPack;

import java.io.Serializable;

public class Message implements Serializable {
	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return "Message [content=" + content + "]";
	}

	private String content;

	public Message(String string) {
		this.content = string;
	}

	public static void main(String[] args) {
		Message m = new Message("Coucou");
	}
}
