package com.infinite.dao.chatbotweb;
import java.sql.*;
public class DBConnection  {

	private static Connection con;
	private DBConnection() {}

	private  Connection getInstance() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String unicode="useSSL=false&autoReconnect=true&allowPublicKeyRetrieval=true&useUnicode=yes&characterEncoding=UTF-8";
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bot?"+unicode, "root", "root");
	        return con;
		}//end of try
		
		catch(Exception e) {
			System.out.println("Cannot connect the database!");
			  e.printStackTrace();
			return null;
			//throw new IllegalStateException("Cannot connect the database!", e);
		}
	}


	public static Connection connect() {
		
		if(con == null) {
			DBConnection connection = new DBConnection();
			
		return	connection.getInstance();
	}else {
		System.out.println("reUsing the same object");
		return con;
	}
	
		
	}

	
	/*public static void  close() {
		try {
			con.close();
		} catch (SQLException e) {
			throw new IllegalStateException("Unable to close the Database Connection...!!!", e);
		}
		
	}*/
	
	
	
}
