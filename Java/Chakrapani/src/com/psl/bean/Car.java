package com.psl.bean;

public class Car extends Vehical{

	private OilPump opump;
	public Car() {
		//getEngine().setStrokes(Strokes.four);
	}
	public OilPump getOpump() {
		return opump;
	}
	public void setOpump(OilPump opump) {
		this.opump = opump;
	}

	
}
