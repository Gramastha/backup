package com.psl.entity;

public abstract class Shape {
	private String name;
	private double area, perimeter;
	
	
	
	public Shape(String name) {
		super();
		this.name = name;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



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
	
	
	public abstract void calculateArea();
	public abstract void calculatePerimeter();
	
}
