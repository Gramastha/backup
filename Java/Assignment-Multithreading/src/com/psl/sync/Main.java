package com.psl.sync;

public class Main {

	public static void main(String[] args) {
		Storage s= new Storage();
		Counter c= new Counter(s);
		Printer p= new Printer(s);
		c.start();
		
		p.start();

	}

}
