package com.learn2drive.bean;

public class SUV extends Car{
	
	private boolean fourWD;

	public boolean isFourWD() {
		return fourWD;
	}

	public void setFourWD(boolean fourWD) {
		this.fourWD = fourWD;
	}

	
	public SUV(String make, String model, String color, Engine engine,
			boolean fourWD) {
		super(make, model, color, engine);
		this.fourWD = fourWD;
	}

	public SUV() {
		super();	}

	@Override
	public String toString() {
		return String.format("%s --- %s--- %s--- %s", getMake(), getModel(), getColor(), isFourWD());
	}
	

}
