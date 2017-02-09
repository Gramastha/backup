package com.psl.bean;

import org.springframework.stereotype.Component;

@Component(value="employee")
public class Employee{

	
	private int id;
	private String name;
	
	
	
	public Employee() {
		

	}
	
	public Employee(String name) {
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
		return String.format("Employee [id=%s, name=%s, age=%s]", id, name);
	}

	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	
}
