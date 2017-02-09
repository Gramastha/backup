package com.psl.bean;

import com.psl.main.Implementation;

public class Customer extends Thread {
	
	public Customer(String name) {
		super(name);
	}

	//@Override
	/*public  void run() {
		Implementation impl= new Implementation();
		System.out.println();impl.purchase(Gender.Men, Shape.Oval, Type_Watch.Analog, Style.Dress, Brand.Fossil);
		System.out.println("Mr."+Thread.currentThread().getName()+s);
	}*/
}
