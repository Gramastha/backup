package com.psl.geometry;

public class Cube extends Threedim{
	
	private double side;

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}

	public Cube( double side) {
		super("Cube");
		this.side = side;
	}

	@Override
	public void cal_surfacearea() {
		setSurfaceArea(6*side*side);
		
	}

	@Override
	public void cal_volume() {
		setVolume(side*side*side);
		
	}
	

}
