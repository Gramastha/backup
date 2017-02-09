package com.psl.files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;



public class UserInput {
	static File f;
	public static void main(String[] a){
		filewriter("Welcome to persistent systems limited");
		f.deleteOnExit();
		
	}
	public static void filewriter(String s){
		f= new File("io.txt");
		
		try {
			
			//Scanner s= new Scanner(System.in);
			PrintWriter pw= new PrintWriter(f);
			pw.print(s);
			pw.flush();
			
			lengthFile(f);
			printContents();
			
			
		}  catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static void lengthFile(File f){
		System.out.println("Length of file: "+f.length());
		
	}
	public static void printContents(){
		try {
			Scanner s= new Scanner(f);
			while(s.hasNextLine()){
				System.out.println(s.nextLine());
			}
			s.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}
