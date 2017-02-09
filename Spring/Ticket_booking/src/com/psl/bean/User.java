package com.psl.bean;

public class User {

	private String name;
	private int age;
	private Ticket ticket;
	
	public User() {
		// TODO Auto-generated constructor stub
	}

	public User(String name, int age, Ticket ticket) {
		super();
		this.name = name;
		this.age = age;
		this.ticket = ticket;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Ticket getTicket() {
		return ticket;
	}

	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}

	@Override
	public String toString() {
		return String.format("User [name=%s, age=%s, ticket=%s]", name, age,
				ticket);
	}
	
}
