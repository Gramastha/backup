package com.psl.geometry;

public class Circle extends Twodim{
	
	private double radius;

	public Circle(double radius) {
		super("circle");
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public void cal_area() {
		setArea(getRadius()*getRadius()*Math.PI);
		
	}

	@Override
	public void cal_perimeter() {
		setPerimeter(Math.PI*2*getRadius());
		
	}

	

}
