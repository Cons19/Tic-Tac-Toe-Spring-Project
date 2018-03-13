package stud.mandatory.tictactoe.repositories.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

	private final static String USERNAME = "tictactoeprj";
	private final static String PASSWORD = "Jr0hZAan2u~-";
	private final static String CONNECTION_URL = "jdbc:mysql://den1.mysql6.gear.host/tictactoeprj?useSSL=false";

	public static Connection getConnection(){
		try{
			return DriverManager.getConnection(CONNECTION_URL, USERNAME, PASSWORD);
		} catch (SQLException e){
			e.printStackTrace();
			return null;
		}
	}

}