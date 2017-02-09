package com.psl.geometry;

public class Shape {
	
	String name;
	int numberDim;
	double size[];

	
public Shape() {
	
}


public String getShape() {
	return name;
}


public void setShape(String shape) {
	this.name = shape;
}


public int getNumberDim() {
	return numberDim;
}


public void setNumberDim(int numberDim) {
	this.numberDim = numberDim;
}


public double[] getSize() {
	return size;
}


public void setSize(double[] size) {
	this.size = size;
}


public Shape(String shape) {
	super();
	this.name = shape;
	
}
	

}
