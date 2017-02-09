package com.psl.client;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;



public class Start {

	public static void main(String[] args) {
		Car car= new Car("Hyundai", "Creta", "champange gold", new Engine(1200,200,FuelType.PETROL));
		Car c1= new Car("maruti", "baleno", "brown", new Engine(1000,200,FuelType.DESEL));
	  try {
		ObjectOutputStream os= new ObjectOutputStream(new FileOutputStream("car-db"));
		os.writeObject(car);
		os.writeObject(c1);
		
		os.close();
		
		
		ObjectInputStream is= new ObjectInputStream(new FileInputStream("car-db"));
		Car c;
		while((c=(Car)is.readObject())!=null){
			System.out.println(c);
			
		}
		
		
		
		is.close();
	}catch(EOFException e){
		System.out.println("End of File");
	} catch (IOException e) {
		e.printStackTrace();
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} 
		
	}

}
