package com.psl.util;

public class MyThread extends Thread {
	public MyThread(String name) {
		super(name);
	}
@Override
public void run() {
	for(int x=1;x<6;x++){
		System.out.println(String.format("%5d %s", x,getName()));
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}
}
}
