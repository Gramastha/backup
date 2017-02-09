package com.psl.movie;

import java.io.File;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Savepoint;
import java.sql.Statement;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MOVIELoader {
	static Connection connection;
	
	
	public static void save2DB() throws ClassNotFoundException, SQLException, FileNotFoundException{
		Class.forName("com.mysql.jdbc.Driver");
		connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/abc", "root", "root");
		PreparedStatement statement;
		statement= connection.prepareStatement("INSERT INTO movies VALUES(?,?,?,?)");
		Scanner s= new Scanner(new File("movies.txt"));
		String word[];
		String date[];
		while(s.hasNextLine()){
			word= s.next().split(",");
			statement.setInt(1, Integer.parseInt(word[0]));
			statement.setString(2, word[1]);
			statement.setString(3, word[2]);
			date= word[3].split("/");
		//	System.out.println(String.format("%s-%s-%s", "20"+date[2],date[1],date[0]));
			statement.setDate(4, Date.valueOf(String.format("%s-%s-%s", "20"+date[2],date[1],date[0])));
			statement.executeUpdate();
		}
	}
	
	
	public static void newMovie(String  movie_name,String language,Date date) throws SQLException, ClassNotFoundException{
		Statement statement;
		Class.forName("com.mysql.jdbc.Driver");
		connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/abc", "root", "root");
	//	System.out.println(movie_name+"   "+language+"   "+date);
		statement= connection.createStatement();
		statement.execute("insert into movies(movie_name,language,date) values('"+movie_name+"','"+language+"','"+date+"')");
		
	}
	
	/*public static void addShow(String movie_name,String show_time, int total_seats){
		Statement statement;
		Class.forName("com.mysql.jdbc.Driver");
		connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/abc", "root", "root");
		System.out.println(movie_name+"   "+language+"   "+date);
		statement= connection.createStatement();
		//statement.execute("insert into movies(movie_name,language,date) values('"+movie_name+"','"+language+"','"+date+"')");
	}*/
	public static void main(String[] args) {
		Pattern p=Pattern.compile("[a][a-z]*.java");
		Matcher m= p.matcher("abhishekab.java");
		System.out.println(m.matches());
	}

}
