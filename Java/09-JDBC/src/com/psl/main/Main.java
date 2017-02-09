package com.psl.main;


import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



import com.psl.bean.Contact;

public class Main {

	public static void main(String[] args) {
		Contact c1= new Contact("Abhishek", "Gramastha", Date.valueOf("2010-10-10"));
		Contact c2= new Contact("Govind", "KSS", Date.valueOf("2011-11-11"));
		Contact c3= new Contact("Shubham", "Gupta", Date.valueOf("2012-12-12"));
		Contact c4= new Contact("Ashish", "Undirwade", Date.valueOf("2013-1-13"));
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/csm", "root", "root");
			
			
		PreparedStatement statement;
			statement= connection.prepareStatement("INSERT INTO tbl_contacts(first_name,last_name,date_of_birth) VALUES(?,?,?)",
													ResultSet.TYPE_SCROLL_INSENSITIVE,
													ResultSet.CONCUR_UPDATABLE);
			statement.setString(1, c1.getFname());
			statement.setString(2, c1.getLstname());
			statement.setDate(3, c1.getDob());
		//	statement.executeUpdate();

			statement.setString(1, c2.getFname());
			statement.setString(2, c2.getLstname());
			statement.setDate(3, c2.getDob());
		//	statement.executeUpdate();
			
			statement.setString(1, c3.getFname());
			statement.setString(2, c3.getLstname());
			statement.setDate(3, c3.getDob());
		//	statement.executeUpdate();
			statement.setString(1, c4.getFname());
			statement.setString(2, c4.getLstname());
			statement.setDate(3, c4.getDob());
			//statement.executeUpdate();

			ResultSet resultSet=statement.executeQuery("SELECT * FROM tbl_contacts t");
			while(resultSet.next()){
				System.out.println(resultSet.getInt(1));
				System.out.println(resultSet.getString("first_name"));
				System.out.println(resultSet.getString("last_name"));
				System.out.println(resultSet.getString("date_of_birth"));
				System.out.println("---------------------------------------------");
			}
			System.out.println("=================================================");
			while(resultSet.previous()){
				
				resultSet.updateString("first_name", "New "+resultSet.getString("first_name"));
				resultSet.updateRow();
				/*System.out.println(resultSet.getInt(1));
				System.out.println(resultSet.getString("first_name"));
				System.out.println(resultSet.getString("last_name"));
				System.out.println(resultSet.getString("date_of_birth"));
				System.out.println("---------------------------------------------");*/
			}
			statement.close();
			connection.close();
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}
	}

}
