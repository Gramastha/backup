package com.psl.util;

public class MyRunnable implements Runnable{
	
	private Thread th;
	public MyRunnable(String name) {
	th=new Thread(this, name);
	
	th.start();
	}
	@Override
	public void run() {

		for(int x=1;x<6;x++){
			System.out.println(String.format("%-5d %s", x,th.getName()));
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		
	}

}
