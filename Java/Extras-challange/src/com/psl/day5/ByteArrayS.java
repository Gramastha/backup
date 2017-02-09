package com.psl.day5;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class ByteArrayS {
	public static void write(String file) throws IOException{
		Scanner scan= new Scanner(new File(file));
		ByteArrayOutputStream bs= new ByteArrayOutputStream();
		FileOutputStream fo= new FileOutputStream("out.txt");
		String str;
	
		while(scan.hasNextLine()){
			str=scan.nextLine();
			bs.write(str.getBytes());
			
		}
		fo.write(bs.toByteArray());
		scan.close();
		fo.flush();
		fo.close();
	}
	public static void main(String a[]){
		try {
			write("abc.txt");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
