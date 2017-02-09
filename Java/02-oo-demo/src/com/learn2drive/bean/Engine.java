package com.learn2drive.bean;

public class Engine {
	
	private int cubicCapacity;
	private double horsepower;
	public FuelType fuelType;
	public int getCubicCapacity() {
		return cubicCapacity;
	}
	public void setCubicCapacity(int cubicCapacity) {
		this.cubicCapacity = cubicCapacity;
	}
	public double getHorsepower() {
		return horsepower;
	}
	public void setHorsepower(double horsepower) {
		this.horsepower = horsepower;
	}
	public FuelType getFuleType() {
		return fuelType;
	}
	public void setFuleType(FuelType fuelType) {
		this.fuelType = fuelType;
	}
	public Engine(int cubicCapacity, double horsepower, FuelType fuelType) {
		super();
		this.cubicCapacity = cubicCapacity;
		this.horsepower = horsepower;
		this.fuelType = fuelType;
	}
	
	public Engine() {
		super();
	}

}
