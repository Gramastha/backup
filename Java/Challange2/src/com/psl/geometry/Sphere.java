package com.psl.geometry;

public class Sphere extends Threedim{
	
	private double radius;

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public Sphere( double radius) {
		super("Sphere");
		this.radius = radius;
	}

	@Override
	public void cal_surfacearea() {
		setSurfaceArea(4*22/7*radius*radius);
		
	}

	@Override
	public void cal_volume() {
		setVolume((4/3)*22/7*radius*radius*radius);
		
	}
	

}
