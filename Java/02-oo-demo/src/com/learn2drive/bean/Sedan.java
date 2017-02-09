package com.learn2drive.bean;

public class Sedan extends Car {
	private boolean convertible;

	public boolean isConvertible() {
		return convertible;
	}

	public void setConvertible(boolean convertible) {
		this.convertible = convertible;
	}

	
	public Sedan(String make, String model, String color, Engine engine,
			boolean convertible) {
		super(make, model, color, engine);
		this.convertible = convertible;
	}

	public Sedan() {
		super();
	}

}
