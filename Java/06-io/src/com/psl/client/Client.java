package com.psl.client;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Client {

	public static void main(String[] args) {
		try {
			File f=new File("car-db");
			FileInputStream fis= new FileInputStream(f);
			
			Properties properties= new Properties();
			properties.load(fis);
			
			
			System.out.println(properties.getProperty("server"));
			System.out.println(properties.getProperty("name"));
			System.out.println(properties.getProperty("Employee"));

			
			fis.close();
			f.delete();
			
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
/*traditional code
 * 
 * 
 * 
 * 
			FileInputStream fis= new FileInputStream(new File("C:\\Users\\Public\\Pictures\\Sample Pictures\\Koala.jpg"));
			FileOutputStream fo= new FileOutputStream(new File("C:\\Users\\Public\\Pictures\\Sample Pictures\\Ashish.jpg"));
			
			byte byteValue[]= new byte[1024];
			int bytesRead;
			while((bytesRead=fis.read(byteValue))!=-1){
				fo.write(byteValue, 0, bytesRead);
			}
			
			fis.close();
			fo.close();
			
			
			
		
 * 
 * 
 * 
 */