package com.psl.factThread;

public class NumberPrinter {

	public static void main(String[] args) throws InterruptedException {
		Number n= new Number();
		FileReader f= new FileReader(n);
		Factorial fact= new Factorial(n);
		
		f.start();
		Thread.sleep(1000);
		fact.start();
	}
}
