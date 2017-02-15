package ad;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import entites.Parking;

public class ParkingDAO extends Dao {
	private static Dao instance;

	private ParkingDAO() {
		super();
	}

	private static void affiche(String message) {
		System.out.println(message);
	}

	private static void arret(String message) {
		System.err.println(message);
		System.exit(99);
	}

	public List<Parking> getAllParking() {

		Connection con = null;
		ResultSet resultats = null;
		String requete = "";

		// chargement du pilote
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			arret("Impossible de charger le pilote ");
		}

		// connection a la base de données

		affiche("connexion a la base de données");
		try {

			// String DBurl = "jdbc:mysql://localhost:3306/hotel";
			String DBurl = "jdbc:mysql://localhost:3306/mydatabase?autoReconnect=true&useSSL=false";

			con = DriverManager.getConnection(DBurl, "root", "root");
		} catch (SQLException e) {
			arret("Connection à la base de données impossible");
		}

		// creation et execution de la requete
		affiche("creation et execution de la requête");

		requete = "SELECT * FROM user";
		Statement stmt = null;
		try {
			stmt = con.createStatement();
			resultats = stmt.executeQuery(requete);
		} catch (SQLException e) {
			arret("Anomalie lors de l'execution de la requête");
		}

		// parcours des données retournées
		affiche("parcours des données retournées");
		try {
			List l = new ArrayList<Parking>();
			while (resultats.next()) {
				Parking p = new Parking();
				p.setNom(resultats.getString("nom"));
				p.setLieu(resultats.getString("lieu"));
				// System.out.print("nom=" + resultats.getString("nom"));
				// System.out.print("prenom=" + resultats.getString("prenom"));
				// System.out.println(resultats.getString(1));
				l.add(p);

				affiche("fin du programme");
				System.exit(0);
				return l;
			}

			resultats.close();
			stmt.close();
			con.close();
		} catch (SQLException e) {
			arret(e.getMessage());
		}
		return null;

	}

	public static Dao getInstance() {
		if (instance == null)
			instance = new ParkingDAO();
		return instance;
	};

}
