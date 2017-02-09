package com.client;

import java.io.File;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collections;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import com.beans.Peripheral;

public class Client {
	static Set<Peripheral> peri;
	
	public static void main(String[] args) throws FileNotFoundException {
	 peri= new TreeSet<Peripheral>();
	 readPeripheralInventory(peri);
	 peri=sortInventoryByPrice(peri);
	 for(Peripheral p:peri){
		 System.out.println(p);
	 }
	 peri=sortInventoryByQuantityPrice(peri);
	 for(Peripheral p:peri){
		 System.out.println(p);
	 }
	 peri=filterInventoryByPrice(900, 7000, peri);
	 for(Peripheral p:peri){
		 System.out.println(p);
	 }
	}

	/** this method will read peripheral details from the CSV file
	given to you and populate the Set
	 * @throws FileNotFoundException */
	public static void readPeripheralInventory(Set<Peripheral> peripherals) throws FileNotFoundException {
		Scanner scr= new Scanner(new File("Peripherals.txt"));
		String[] words;
		while(scr.hasNextLine()){
			words= scr.nextLine().split(",");
			Peripheral p= new  Peripheral();
			p.setItemCode(words[0]);
			p.setName(words[1]);
			p.setDescription(words[2]);
			p.setPrice(Integer.parseInt(words[3]));
			p.setQuantity(Integer.parseInt(words[4]));
			peripherals.add(p);
		}
	}

	/** this method will insert the peripheral information read earlier
	into a database table 
	 * @throws ClassNotFoundException 
	 * @throws SQLException */
	public static void insertPeripheralRecords(Set<Peripheral> peripherals) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/abc", "root", "root");
		PreparedStatement statement;
		statement= conn.prepareStatement("INSERT INTO peripheral VALUES(?,?,?,?,?)");
		for(Peripheral p:peripherals){
			statement.setString(1,p.getItemCode() );
			statement.setString(2,p.getName() );
			statement.setString(3,p.getDescription() );
			statement.setInt(4,p.getPrice() );
			statement.setInt(5,p.getQuantity() );
			statement.executeUpdate();
		}
		
	}

	/** this method will sort a given Set by price in the ascending order.
	It will create a new ordered Set and return it. */
	public static Set<Peripheral>  sortInventoryByPrice(Set<Peripheral> peripherals) {
		Set<Peripheral> pe= new TreeSet<Peripheral>();
		for(Peripheral p:peripherals){
			pe.add(p);
		}
		return pe;
	}

	/** this method will sort a given Set by quantity in the ascending order.
	Peripherals with the same quantity should be sorted amongst themselves 
	by price in the ascending order. It will return a new Set with the sorted objects */
	public static Set<Peripheral>  sortInventoryByQuantityPrice(Set<Peripheral> peripherals) {
	
		Set<Peripheral> pe= new TreeSet<Peripheral>(new Peripheral());
		for(Peripheral p:peripherals){
			pe.add(p);
		}
		return pe;
	}

	/** this method will return a new Set with records filtered from an existing Set on the basis
	of price. Both prices are inclusive. */
	public static Set<Peripheral> filterInventoryByPrice(int startingPrice, int endingPrice, Set<Peripheral> peripherals) {
		Set<Peripheral> pe= new TreeSet<Peripheral>(new Peripheral());
		for(Peripheral p:peripherals){
			if(p.getPrice()>=startingPrice && p.getPrice()<=endingPrice){
				pe.add(p);
			}
		}
		return pe;
	}
}
