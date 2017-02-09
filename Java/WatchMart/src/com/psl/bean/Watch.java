package com.psl.bean;

public class Watch {
	private int id;
	private double cost;
	private Type_Watch type;
	private Shape shape;
	private Brand brand;
	private int quantity;
	
	
	
	@Override
	public String toString() {
		return "Watch [id=" + id + ", cost=" + cost + ", type=" + type
				+ ", shape=" + shape + ", brand=" + brand + ", quantity="
				+ quantity + "]";
	}
	public Watch(int id, double cost, Type_Watch type, Shape shape,
			Brand brand, int quantity) {
		super();
		this.id = id;
		this.cost = cost;
		this.type = type;
		this.shape = shape;
		this.brand = brand;
		this.quantity = quantity;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public Type_Watch getType() {
		return type;
	}
	public void setType(Type_Watch type) {
		this.type = type;
	}
	public Shape getShape() {
		return shape;
	}
	public void setShape(Shape shape) {
		this.shape = shape;
	}
	public Brand getBrand() {
		return brand;
	}
	public void setBrand(Brand brand) {
		this.brand = brand;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	

}
