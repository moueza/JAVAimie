package myPack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import ad.ParkingDAO;
import entites.Parking;
import entites.Voiture;

public class Exec {

	public static void main(String[] args) {
	//test DAO
		List<Parking>	 parkingList = ParkingDAO.getInstance().getAllParkings();
		
		Voiture v1 = new Voiture("Tigra","Opel");
		Voiture v2 = new Voiture("Tigra RC","Opel");
		
		Parking p1 = new Parking("1","Talensac","place du marche");
		v1.insertToParking(p1);
		//ParkingDAO.getInstance().getAllParking();
		//TODO create table
		
		
		//tests metier
	}

}
