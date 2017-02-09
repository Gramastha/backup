package com.psl.bean;

public class Train {
	private String name;
	
	
	
	
	public Train() {
		super();
	}
	public Train(String name) {
		super();
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return String.format("Train [name=%s]", name);
	}
	
	
}
