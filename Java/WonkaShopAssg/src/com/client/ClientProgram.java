package com.client;

import java.io.File;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;

import com.bean.Product;
import com.bean.Transaction;
import com.bean.User;
import com.exception.InvalidPasswordException;
import com.exception.InvalidUserException;

public class ClientProgram {
	static User logged;
	/**
	 * @param args
	 * @throws SQLException 
	 * @throws ClassNotFoundException 
	 * @throws FileNotFoundException 
	 * @throws InvalidPasswordException 
	 * @throws InvalidUserException 
	 */
	public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, SQLException, InvalidUserException, InvalidPasswordException {
		ClientProgram cp= new ClientProgram();
		 List<User> use;
		 List<Product> listprod;
			listprod= cp.readProductsFromFile("Wonka_Products.txt");
			
			use=cp.initUsers();
			
			
			System.out.println(cp.authenticate(new User(12345l, "Mr. Cadbury"), use));
			
		List<Transaction> listTran= new ArrayList<Transaction>();
		
		cp.processOrder(listTran);
			List<Transaction> tr=cp.getPurchaseTransactionsFromDb();
	for(Transaction t:tr){
		System.out.println(t);
	}
		
	
		System.out.println("Total: "+cp.calculateFinalBillAmount(tr));
		
}
	public List<Product> readProductsFromFile(String fullFilePath) throws FileNotFoundException, ClassNotFoundException, SQLException{
		List<Product> lp= new ArrayList<Product>();
		Scanner scr= new Scanner(new File(fullFilePath));
		String words[];
		while(scr.hasNextLine()){
			words=scr.nextLine().split("\t");
			lp.add(new Product(Integer.parseInt(words[0]), words[1], Float.parseFloat(words[2]),Integer.parseInt(words[3]) ));
		}
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/wdb", "root", "root");
		
		
	PreparedStatement statement;
		statement= connection.prepareStatement("INSERT INTO products_tbl VALUES(?,?,?,?)");
		for(Product p: lp){
			statement.setInt(1, p.getItemCode());
			statement.setString(2, p.getName());
			statement.setFloat(3, p.getPrice());
			statement.setInt(4, p.getAvailableCount());
			statement.executeUpdate();
		}
		return lp;
		
	}
	
	public List<User> initUsers(){
		List<User> lu=new ArrayList<User>();
		lu.add(new User(12345l, "Mr. Cadbury"));
		lu.add(new User(67890l, "Mrs. Lindt"));
		lu.add(new User(54321l, "Mr. Gramastha"));
		
		return lu;
	}
	
	public boolean authenticate(User user, List<User> users) throws InvalidUserException, InvalidPasswordException{
		
		for(User u:users){
		
			if(user.getId().equals(u.getId())){
				logged=u;
				return true;
			}
			else if(user.getName().equalsIgnoreCase(u.getName())) new InvalidPasswordException("User credentials doest not match");
			else throw new InvalidUserException("User does not exists");
		}
		
		
		
		return false;
		
	}
	
    public void processOrder(List<Transaction> transactions) throws ClassNotFoundException, SQLException{
    	Class.forName("com.mysql.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/wdb", "root", "root");
		Statement s= connection.createStatement();
		ResultSet rs= s.executeQuery("select * from products_tbl");
		List<Product> p= new ArrayList<Product>();
		while(rs.next()){
			p.add(new Product(rs.getInt("itemCode"), rs.getString("name"), rs.getFloat("price"), rs.getInt("availableCount")));
		}
		System.out.println("Here is what we offer:");
		System.out.println("Item Code\t\tName\t\tUnit Price (Rs.)");
		for(Product pr:p)
    	System.out.println(pr.getItemCode()+"\t\t"+pr.getName()+"\t\t\t"+pr.getPrice());
		Scanner scr= new Scanner(System.in);
		int prodcode,quan;
		boolean b=true;
		while(true){
			System.out.println("What would you like today");
			prodcode=scr.nextInt();
			for(Product pr:p){
				if(pr.getItemCode()==prodcode)
				{
					

					System.out.println("Please enter the quantity for--"+pr.getName());
					quan=scr.nextInt();
					if(pr.getAvailableCount()<quan){
						System.out.println("Enter valid input");
						continue;
					}
					else{
						pr.setAvailableCount(pr.getAvailableCount()-quan);
						Transaction t=new Transaction(pr, logged, quan, pr.getPrice()*quan);
						
						transactions.add(t);
						
					}
					b=true;
				
				}
			}
			
			System.out.println("Do you want to buy more?(y/n):");
			String go=scr.next();
			
			if(go.equalsIgnoreCase("y")) continue;
			else 
				break;
			
			
			
		}
		
		
		PreparedStatement statement;
		statement= connection.prepareStatement("update products_tbl set availableCount=? where itemCode=?");
		for(Product pr:p){
			statement.setInt(2, pr.getItemCode());
			
			statement.setInt(1, pr.getAvailableCount());
			statement.executeUpdate();
		}
		statement= connection.prepareStatement("INSERT INTO bill_tbl VALUES(?,?,?,?)");
		for(Transaction t:transactions){
			for(Product pr:p){
				if(t.getItem().getItemCode()==pr.getItemCode()){
			statement.setLong(1, logged.getId());
			statement.setInt(2, pr.getItemCode());
			statement.setInt(3, t.getQuantity());
			statement.setFloat(4, t.getTotal());
			statement.executeUpdate();
		}
			}
		}
		
		
		
    }
    
    public List<Transaction> getPurchaseTransactionsFromDb() throws ClassNotFoundException, SQLException{
    	List<Transaction> tli= new ArrayList<Transaction>();
    	Class.forName("com.mysql.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/wdb", "root", "root");
		Statement s= connection.createStatement();
		ResultSet rs= s.executeQuery("select * from products_tbl");
		List<Product> p= new ArrayList<Product>();
		while(rs.next()){
			p.add(new Product(rs.getInt("itemCode"), rs.getString("name"), rs.getFloat("price"), rs.getInt("availableCount")));
		}
		
	Statement statement;
		statement= connection.createStatement();
    	 rs=statement.executeQuery("SELECT * FROM bill_tbl");
    	while(rs.next()){
    		int item=rs.getInt("item_code");
    		for(Product pr:p){
    			if(pr.getItemCode()==item){
    				tli.add(new Transaction( pr,logged, rs.getInt("qty"), rs.getFloat("total")));
    			}
    		}
    	}
    	
    	return tli;
    }
    
    public double calculateFinalBillAmount(List<Transaction> purchaseList){
    	double total=0;
    	System.out.println("Member name: "+logged.getName());
    	System.out.println("==================================================================\nItem Code		Name		Unit Price (Rs.)		Qty		Total\n==================================================================");
    	for(Transaction t:purchaseList){
    		total+=t.getTotal();
    		System.out.println(t.getItem().getItemCode()+"\t"+t.getItem().getName()+"\t"+t.getItem().getPrice()+"\t"+t.getQuantity()+"\t"+t.getTotal());
    		
    	}
    	double vat=total*0.01;
    	System.out.println("====================================================================");
    	System.out.println("subtotal: "+total+"\nVAT: "+vat);
    	return total+vat;
    }
}