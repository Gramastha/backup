package com.psl.readthread;

public class Readerrr {

	public static void main(String[] args) {


		ReadFile r1,r2;
		r1= new ReadFile("Thread 1", args[0]);
		r2= new ReadFile("Thread 2", args[1]);
		
		r1.start();
		r2.start();

	}

}
