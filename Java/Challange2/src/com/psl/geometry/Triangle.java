package com.psl.geometry;

public class Triangle extends Twodim{
private double base,height;

public double getBase() {
	return base;
}

public void setBase(double base) {
	this.base = base;
}

public double getHeight() {
	return height;
}

public void setHeight(double height) {
	this.height = height;
}

public Triangle( double base,
		double height) {
	super("Triangle");
	this.base = base;
	this.height = height;
}

@Override
public void cal_area() {
	setArea(0.5*base*height);
	
}

@Override
public void cal_perimeter() {
	double a= Math.sqrt(base*base+height*height);
	setPerimeter(a+base+height);
	
}


}
