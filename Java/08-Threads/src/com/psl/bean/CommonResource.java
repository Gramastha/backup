package com.psl.bean;

import java.util.Random;

public class CommonResource {

	private int numbers[];
	private Random random;
	private boolean available;
	public CommonResource() {
		
		numbers = new int[50];
		random = new Random();
		available = true;
	}
	
	
	public synchronized void getLock() throws InterruptedException{
		System.out.println("Inside GetLock Method: "+Thread.currentThread().getName());
		while(!available) wait();
		available=false;
		System.out.println("End of wait()...."+Thread.currentThread().getName());
	}
	public synchronized void releaseLock(){
		System.out.println("About to notify..."+Thread.currentThread().getName());
		notifyAll();
		available=true;
		System.out.println("Lock released...."+Thread.currentThread().getName());
		
	}
	
	public int getSize(){
		return numbers.length;
	}
	public void setNumber(int index,int value){
		numbers[index]= value;
	}
	public int getNumber(int index){
		return numbers[index];
	}
	public int generateNumber(){
		int value;
		do{
			value=random.nextInt();
		}while(value<0||value>0x3e);
		return value;
	}
	
}
