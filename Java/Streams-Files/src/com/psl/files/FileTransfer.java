package com.psl.files;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileTransfer {
	FileInputStream fis;
	FileOutputStream fo;
	
	public void isPresent(String output) throws FileNotFoundException{
		File f= new File(output);
		boolean flag= false;
		
		if(f.exists()){
			System.out.println(output+" destination file exists.\n whether you want to overwrite? Yes/No");
			Scanner s= new Scanner(System.in);
			String optn= s.next().trim();
			if(optn.equalsIgnoreCase("Yes")) flag=true;
			
			else flag= false;
			
			fo=new FileOutputStream(f, flag);
			
		}
		else{
			
			fo= new FileOutputStream(f);
		}
		
	}
	public void copyFiles(String input, String output) throws IOException{
		isPresent(output);
		fis= new FileInputStream(input);
		byte byteValue[]= new byte[1024];
		int bytesRead;
		
			while((bytesRead=fis.read(byteValue))!=-1){
				fo.write(byteValue, 0, bytesRead);
			}
		
		
		fis.close();
		fo.close();
		
	}
}
