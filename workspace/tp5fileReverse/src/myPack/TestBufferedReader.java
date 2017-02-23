package flux;

import java.io.*;

public class TestBufferedReader {
	protected String source;

	public TestBufferedReader(String source) {
		this.source = source;
		lecture();
	}

	public static void main(String args[]) {
		new TestBufferedReader("source.txt");
	}

	private void lecture() {
		try {
			String ligne;
			BufferedReader fichier = new BufferedReader(new FileReader(source));

			while ((ligne = fichier.readLine()) != null) {
				System.out.println(ligne);
			}
			fichier.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}