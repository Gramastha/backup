package com.psl.entity;

public class Circle extends Shape {
	
	private double radius;

	public Circle( double radius) {
		super("Circle");
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public void calculateArea(){
		setArea(getRadius()*getRadius()*Math.PI);
	}

	@Override
	public void calculatePerimeter() {
		setPerimeter(Math.PI*2*getRadius());
		
	}

	

}
