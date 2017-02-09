package com.psl.geometry;

public class Rectangle extends Twodim{
	private double length,breadth;

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

	public Rectangle(double length, double breadth) {
		super("Rectangle");
		this.length = length;
		this.breadth = breadth;
	}

	@Override
	public void cal_area() {
		setArea(getLength()*getBreadth());
		
	}

	@Override
	public void cal_perimeter() {
		setPerimeter(2*(length+breadth));
		
	}

	
	
	

}
