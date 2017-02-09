package com.psl.bean;

public class Scooter extends Vehical{
	
	PetrolEngine pengine= new PetrolEngine();
	public Scooter() {
		pengine.setStrokes(Strokes.four);
	}

	

}
