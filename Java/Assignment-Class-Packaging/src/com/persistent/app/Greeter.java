package com.persistent.app;

public class Greeter {
	
	private String name;

	public Greeter(String name) {
		super();
		this.name = name;
	}
	public void sayHello(){
		System.out.println("Hello "+name+"!");
	}
	public void sayGoodBye(){
		System.out.println("Goodbye "+name+"!");
	}

}
