package com.psl.readthread;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile extends Thread{
	
	String fname;
	public ReadFile(String str,String fileName) {
		super(str);
		fname=fileName;
		
	}
	@Override
	public void run() {
		try {
			readFile();
		} catch (FileNotFoundException | InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	private void readFile() throws FileNotFoundException, InterruptedException{
		Scanner s= new Scanner(new File(fname));
		while(s.hasNextLine()){
			System.out.println(Thread.currentThread().getName()+" -- "+s.nextLine());
			Thread.sleep(1000);
		}
	}

}
