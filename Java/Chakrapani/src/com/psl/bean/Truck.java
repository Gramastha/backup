package com.psl.bean;

public class Truck extends Vehical{

	private OilPump opump;
	Engine dengine= new DieselEngine();
	public Truck() {
		dengine.setStrokes(Strokes.four);
		dengine.setCylinderNumber(CylinderNumber.twelve);
		
				
	}
	public OilPump getOpump() {
		return opump;
	}
	public void setOpump(OilPump opump) {
		this.opump = opump;
	}
	
	
	

	

}
