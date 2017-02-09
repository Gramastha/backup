package com.learn2drive.main;

import com.learn2drive.bean.Car;
import com.learn2drive.bean.Engine;
import com.learn2drive.bean.FuelType;
import com.learn2drive.bean.SUV;

public class Main {

	public static void main(String[] args) {
		
		Car baleno,i20;
		SUV creta;
		
		baleno= new Car();
		i20= new Car();
		creta = new SUV("Hyundai", "Creta", "champange gold", new Engine(1000,200,FuelType.PETROL), true);
		
		baleno.setMake("Maruti");
		baleno.setModel("Baleno");
		baleno.setColor("Brown");
		
		i20.setColor("Silver");
		i20.setMake("Hyundai");
		i20.setModel("I 20");
		
		System.out.println(creta);
		System.out.println(baleno+"\n"+i20);
	}

}
