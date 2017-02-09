package com.psl.geometry;

public class Pyramid extends Threedim {
	
	private double length,width,height;

	public Pyramid( double length, double width, double height) {
		super("Pyramid");
		this.length = length;
		this.width = width;
		this.height = height;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public void cal_surfacearea() {
	setSurfaceArea(length*width+length*(Math.sqrt((width*width/2)+height*height))+width*(Math.sqrt((length*length/2)+height*height)));
		
	}

	@Override
	public void cal_volume() {
		setVolume(length*width*height/3);
		
	}
	
	

}
