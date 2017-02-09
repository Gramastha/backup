package com.psl.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Vector;

import com.psl.collection.NameClass;
import com.psl.collection.Product;
import com.psl.collection.Student;

public class Main {
	public static void main(String[] args){
		
		Vector<NameClass> vname= new Vector<NameClass>();
		Scanner s;
		while(true){
			System.out.println("1.	accept first name and surname \n2.	display complete name\n3.	exit");
			s= new Scanner(System.in);
			int i=s.nextInt();
			
			switch (i) {
			case 1:
				System.out.println("Enter name & surname");
				BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
				String[] names= new String[2];
				try {
					
					for(int j=0;j<1;j++)
					names = br.readLine().split(" ");
					vname.add(new NameClass(names[0], names[1]));
					break;
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} 
				
			case 2:
				Enumeration vEnum = vname.elements();
			      System.out.println("\nElements in vector:");
			      
			      while(vEnum.hasMoreElements())
			         System.out.print(vEnum.nextElement() + " ");
			      System.out.println();
				break;
			case 3:
				System.out.println("User Exits");
				s.close();
				i=4;
				break;

			default:System.out.println("Enter valid input");
			s.close();
				break;
			}
			if(i==4)
				break;
		}
		
		}
}


/*
 * 
 * List of Students
 * 
 * List<Student> ls= new ArrayList<Student>();
		ls.add(new Student("Abhishek", "Gramastha"));
		ls.add(new Student("Shubham", "Gupta"));
		ls.add(new Student("Abhishek", "Shukla"));
		ls.add(new Student("Shakal", "Shukla"));
		
		
		// find Shakal exists or not
		
		for(Student s:ls){
			if(s.getFname().equals("Shakal"))
				System.out.println("found "+s.getFname());
			
			else
				System.out.println("Entered name not found ");
			
		}
 */



/*
 * 
 * Product Map
 * 
 * Product p=new Product("P001", "Maruti800");
		Product p1= new Product("P002", "MarutiZen");
		Product p3=new Product("P003","MarutiEsteem");
		
	if(	p.searchProduct("MarutiEsteem"))
		System.out.println("Exists");
	p.remove(p3);
	if(	p.searchProduct("MarutiEsteem"))
		System.out.println("Exists");
	else
		System.out.println("NOT");
		*/
