package com.psl.geometry;

public abstract class Twodim extends Shape {
	private double area, perimeter;
	public Twodim(String shape) {
		super(shape);
		
	}
	abstract public void cal_area();
	public abstract void cal_perimeter();
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	public double getPerimeter() {
		return perimeter;
	}
	public void setPerimeter(double perimeter) {
		this.perimeter = perimeter;
	}
	

}
