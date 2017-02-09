package com.psl.bean;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component(value="employee")
public class Employee implements BeanNameAware{

	@Value(value="shduiahd")
	private String name;
	private int age;
	private Address address;
	
	public Employee() {
		System.out.println("IN emp >> default constructor");

	}
	
	public Employee(String name, int age) {
		super();
		System.out.println("IN emp >> para 2 constructor");
		this.name = name;
		this.age = age;
		
	}

	public Employee(String name, int age, Address address) {
		super();
		System.out.println("IN emp >> para 3 constructor");
		this.name = name;
		this.age = age;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("IN emp >> setName");
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		System.out.println("IN emp >> setAge");
		this.age = age;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		System.out.println("IN emp >> setAddress");
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", address="
				+ address + "]";
	}
	
	public void abc() {
		System.out.println("IN ABC");

	}
	public void pqr() {
		System.out.println("IN pqr");

	}

	@Override
	public void setBeanName(String arg0) {
		System.out.println("Set Bean"+ arg0);
		
	}	
}
