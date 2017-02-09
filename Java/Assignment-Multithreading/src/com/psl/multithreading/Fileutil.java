package com.psl.multithreading;

import java.io.File;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Fileutil extends Thread{
private String word;
File file;

public Fileutil(File file, String word) {
	super();
	this.file= file;
	this.word = word;
}
public boolean searchUtil() throws FileNotFoundException {

	String[] w;
	Scanner s= new Scanner(file);
	while(s.hasNextLine()){
		w= s.next().split(" ");
	for(int i=0;i<w.length;i++){
		if(w[i].equalsIgnoreCase(word)) return true;
	}
	}
	s.close();
	return false;
}
@Override
	public void run() {
		try {
			if(searchUtil()) System.out.println("Word: "+word+" is present in given file" );
			
			else 	System.out.println("Word: "+word+" is not present in given file" );

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	}
}
