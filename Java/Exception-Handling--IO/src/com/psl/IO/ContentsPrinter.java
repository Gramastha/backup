package com.psl.IO;

import java.io.File;

public class ContentsPrinter {

	public static void main(String[] args) {
		
		Show("C:\\Users\\Administrator\\Downloads\\xyzz");

	}
	public static void Show(String s){
		File f= new File(s);
		File[] f1= f.listFiles();
		if(f1.length==0)
			System.out.println("NO File Exists");
		else{
			for(File s1:f1){
				if(s1.isDirectory()){
					Show(s1.toString());
				}
				else {
					System.out.println(s1);
				}
			}
		}
	}

}
