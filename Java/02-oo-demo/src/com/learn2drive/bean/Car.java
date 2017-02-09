package com.learn2drive.bean;

public class Car {
	/* data members
	 * instance variables
	 * properties
	 * attributes*/
	
	private String make, model,color;
	private Engine engine;

	
	

	/* instance methods
	 * member functions/ methods
	 * 
	 * getter-- accessor
	 * setter-- mutators*/
	public String getMake() {
		return make;
	}

	@Override
	public String toString() {
		return model+" [make=" + make + ", color=" + color+ "]";
	}

	

	public Car(String make, String model, String color, Engine engine) {
		super();
		this.make = make;
		this.model = model;
		this.color = color;
		this.engine = engine;
	}

	public Car() {
		super();
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

}
