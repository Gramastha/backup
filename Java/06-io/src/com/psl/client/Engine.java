package com.psl.client;

import java.io.Serializable;

public class Engine implements Serializable{
	
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1962098352167680170L;
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
	@Override
	public String toString() {
		return " [cubicCapacity=" + cubicCapacity + ", horsepower="
				+ horsepower + ", fuelType=" + fuelType + "]";
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
