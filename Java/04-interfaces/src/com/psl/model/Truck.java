package com.psl.model;

public class Truck extends Vehical implements Driveable, Steerable{

	@Override
	public void steer() {
		System.out.println("hello");
		
	}

	@Override
	public void drive() {
		System.out.println("hello");
		
		
	}

}
