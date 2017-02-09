package com.psl.sync;

import java.util.Random;

public class Counter extends Thread {
	Storage s;

	public Counter(Storage s) {
		super("Counter");
		this.s = s;
	}
	
	@Override
	public synchronized void run() {
		
			for(int i=0;i<10;i++){
				/*int val;
				do{
					val=(new Random().nextInt())%1000;
					
				}while(s.contains(Math.abs(val)));*/
				 s.setValue(i);
				 try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			
		}
	}

}
