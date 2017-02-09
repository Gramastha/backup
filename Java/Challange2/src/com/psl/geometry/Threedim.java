package com.psl.geometry;

public abstract class Threedim extends Shape{
	
	private double volume,surfaceArea;
	
	
	public Threedim(String shape) {
		super(shape);
		
	}
	public double getVolume() {
		return volume;
	}
	public void setVolume(double volume) {
		this.volume = volume;
	}
	public double getSurfaceArea() {
		return surfaceArea;
	}
	public void setSurfaceArea(double surfaceArea) {
		this.surfaceArea = surfaceArea;
	}
	public abstract void cal_surfacearea();
	public abstract void cal_volume();
}
