package myPack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import ad.ParkingDAO;
import entites.Parking;

public class ExecRead {

	public static void main(String[] args) {
	//test DAO
		List<Parking>	 parkingList = ParkingDAO.getInstance().getAllParking().;
		
		//tests metier
	}

}
