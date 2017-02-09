package com.psl.util;

import com.psl.bean.SharedResource;

public class ReadCounter extends Thread{
private SharedResource sR;
public ReadCounter(SharedResource s) {
sR=s;
}
@Override
	public void run() {
	synchronized(sR){
		System.out.println("Counter: "+sR.readCounter());
	}
	}
}
