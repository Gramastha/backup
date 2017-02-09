package com.psl.factThread;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReader extends Thread{
	Number num;
	public FileReader(Number n) {
		super("FileReader");
		num=n;
		
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
		Scanner s= new Scanner(new File("Number.txt"));
		
		while(s.hasNextLine()){
			for(int i=0;i<5;i++){
				num.setValue(s.nextInt());
			}
			
		}
	}


}
