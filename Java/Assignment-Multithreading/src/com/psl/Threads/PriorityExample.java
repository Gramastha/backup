package com.psl.Threads;

public class PriorityExample {
	
	
	
	public static void main(String args[]){
		MyThread t= new MyThread("ONE");
		MyThread t1= new MyThread("TWO");
		MyThread t2= new MyThread("THREE");
		MyThread t3= new MyThread("FOUR");
		MyThread t4= new MyThread("FIVE");
		MyThread t5= new MyThread("SIX");
		System.out.println("Declearing thread six as highest priority thread");
		
		t5.setPriority(8);
		t.start();
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
	}

}
