package com.psl.bean;

public class SharedResource {

	private long number;
	public SharedResource(long number) {
		this.number= number;
	}
	public  void decrementCounter(){
		while(number>0) {
			number--;
			
		}
	}
	public  long readCounter(){
		return number;
	}
}
