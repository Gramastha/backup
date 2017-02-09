package com.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnectionManager implements DBConnectionUtil {	
	
	public DatabaseConnectionManager() { /*does nothing*/ }
Connection conn;
	public Connection getConnection() throws ClassNotFoundException,
			SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/shoppingdb", "root", "root");
		//System.out.println("Connection open");
		return conn;
		
	}

	public void closeConnection() throws SQLException {
		conn.close();
		//System.out.println("Connection closed");
	}
	
	
}
