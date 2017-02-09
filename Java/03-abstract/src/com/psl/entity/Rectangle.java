package com.psl.entity;

public class Rectangle extends Shape{

	private double length,breadth;
	
	
	

	public Rectangle(double length, double breadth) {
		super("Rectangle");
		this.length = length;
		this.breadth = breadth;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getBreadth() {
		return breadth;
	}

	public void setBreadth(double breadth) {
		this.breadth = breadth;
	}

	@Override
	public void calculateArea() {
		setArea(getLength()*getBreadth());
		
	}

	@Override
	public void calculatePerimeter() {
		setPerimeter(2*(length+breadth));
		
	}
	
	
	
}
