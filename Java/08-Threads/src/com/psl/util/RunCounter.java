package com.psl.util;

import com.psl.bean.SharedResource;

public class RunCounter extends Thread {
	private SharedResource sR;
	public RunCounter (SharedResource s){
		sR= s;
	}
	public void run(){
		synchronized(sR){
			sR.decrementCounter();
		}
		
	}

}
