package com.client;

import java.io.File;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import com.bean.Category;
import com.bean.Product;
import com.bean.ShoppingCart;
import com.exception.ShoppingCartNotFoundException;
import com.util.DBConnectionUtil;
import com.util.DatabaseConnectionManager;

public class Client {
 
	//Use conn object for creating db connection
	static Connection conn;
	
	static void display(){
		System.out.println("Welcome to Shopping Mania!!\n\nPlease select an option:\n 1. Create a Shopping Cart\n 2. Display a Shopping Cart\n 3. Exit");
	}
	
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException, FileNotFoundException {
		Client client= new  Client();
		List<Category> clist=client.readAllCategoriesFromDb();
		client.populateCategoryProducts(clist);
		while(true){
		display();
		Scanner scr= new Scanner(System.in);
		int i=scr.nextInt();
		
		switch(i){
		
		case 1: 
			Scanner scr1=new  Scanner(System.in);
			System.out.println("Please enter user name for the Shopping Cart:");
		String name= scr1.nextLine().trim();
		List<String>userInputProductNames= new  ArrayList<String>();
		String pname;
					while(true){
				System.out.println("Please enter the product name:");
				pname=scr1.nextLine();
				
				System.out.println("Add more products to Shopping Cart? (y/n)");
				userInputProductNames.add(pname);
				if(scr1.hasNextLine()){
					if(scr1.nextLine().equalsIgnoreCase("y")) continue;
					else break;
				}
				else break;
			
					}
					ShoppingCart cr=client.createShoppingCart(name, userInputProductNames, clist);
			System.out.println(cr);
			client.storeShoppingCartIntoDB(cr);
			break;
			
			
		case 2:
			while(true){
				scr= new Scanner(System.in);
				System.out.println("Please enter the name of the user whose Shopping Cart needs to be shown:");
				String str=scr.nextLine().trim();
			try {
				List<Product> p= client.sortShoppingCart(str);
				System.out.println(str+" has following products in the cart:");
				for(Product p1:p)
				System.out.println(p1.getTitle());
				
				break;
				
			} catch (ShoppingCartNotFoundException e) {
					System.out.println(e.getMessage());
					continue;
			}
			
			}
			break;
		}
		if(i==3){
			System.out.println("Goodbye!");
			scr.close();
			break;
		}		}
		
		
	}
	

	public List<Category> readAllCategoriesFromDb() throws ClassNotFoundException, SQLException{
		List<Category> cat=new ArrayList<Category>();
		DatabaseConnectionManager dbcm=new DatabaseConnectionManager();
		Connection c=dbcm.getConnection();
		Statement st= c.createStatement();
		ResultSet rs= st.executeQuery("SELECT * FROM category_tbl");
		while(rs.next()){
			cat.add(new Category(rs.getString("file_name"), rs.getString("category_name")));
		}
		dbcm.closeConnection();
		return cat;
	}
	
	public void populateCategoryProducts(List<Category> categoryList) throws FileNotFoundException{	
		for(Category c:categoryList){
			List<Product> pl=new ArrayList<Product>();
			
			Scanner scr=new Scanner(new File("Categories\\"+c.getFileName()));
			scr.nextLine();
			while(scr.hasNextLine()){
				Product p= new Product();
				String words[]=scr.nextLine().split(",");
				p.setTitle(words[0]);
				//System.out.println(words[0]);
				String col[]= words[1].split(":");
				List<String> brands = new ArrayList<String>();
				for(int i=0;i<col.length;i++){
					brands.add(col[i]);
				}
				p.setBrands(brands);
				pl.add(p);
			}
			
			c.setProducts(pl);
			scr.close();
		}
		

	}
	
	public ShoppingCart createShoppingCart(String userName, List<String> userInputProductNames,List<Category> categories){
		
		ShoppingCart sc= new ShoppingCart();
		List<Product> shopprod= new ArrayList<Product>();
		for(Category c:categories){
			List<Product> p=c.getProducts();
			for(Product p1:p){
			for(String s:userInputProductNames){
				if(s.equalsIgnoreCase(p1.getTitle())){
					shopprod.add(p1);
				}
			}
			}
		}
		sc.setName(userName);
		sc.setProducts(shopprod);
		
		
		return sc;
	}
	
	public void storeShoppingCartIntoDB(ShoppingCart cartObj ) throws ClassNotFoundException, SQLException{
		
		DBConnectionUtil dbu= new DatabaseConnectionManager();
		Connection conn= dbu.getConnection();
		Statement st=conn.createStatement();
		List<Product> plist=cartObj.getProducts();
		for(Product p:plist){
		st.execute("INSERT INTO shoppingcarts_tbl (user_name, product_name) VALUES ('"+cartObj.getName()+"','"+p.getTitle()+"')");
		}
		dbu.closeConnection();

	}
	
	public List<Product> sortShoppingCart(String userName) throws  ShoppingCartNotFoundException, ClassNotFoundException, SQLException{
	
		List<Product> listp= new ArrayList<Product>();
		DBConnectionUtil dbu= new DatabaseConnectionManager();
		Connection conn= dbu.getConnection();
		Statement st=conn.createStatement();
		ResultSet rs= st.executeQuery("SELECT * FROM shoppingcarts_tbl");
		while(rs.next()){
			
			if(rs.getString("user_name").equalsIgnoreCase(userName)){
				//System.out.println(userName+"    "+rs.getString("user_name"));
				Product pp=new Product(rs.getString("product_name"));
				//System.out.println(pp.getTitle());
				listp.add(pp);
			}
			else{
				throw new ShoppingCartNotFoundException();
			}
		}
		dbu.closeConnection();
		
		Collections.sort(listp, new Product());
		return listp;

	
	}
}	