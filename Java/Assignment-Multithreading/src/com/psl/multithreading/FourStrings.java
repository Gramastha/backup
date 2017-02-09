package com.psl.multithreading;

import java.io.File;

public class FourStrings {
	
	public static void main(String[] args) {
		Fileutil f1,f2,f3,f4;
		File f= new File("abc.txt");
		
		f1= new Fileutil(f,args[0]);
		f2= new Fileutil(f,args[1]);
		f3= new Fileutil(f,args[2]);
		f4= new Fileutil(f,args[3]);
		
		
		f1.start();
		f2.start();
		f3.start();
		f4.start();
	}
	
	
	
	

}
