package com.psl.sync;

public class Printer extends Thread {
	Storage s;
static int previous=10;
	public Printer(Storage s) {
		super("Printer");
		this.s = s;
	}
	
	@Override
	public synchronized void run() {
		
			for(int i=0;i<s.size();i++){
				if(!(previous==s.getValue())){
				System.out.println(s.getValue());
				previous=s.getValue();
				}
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
			
		}
	}

}
