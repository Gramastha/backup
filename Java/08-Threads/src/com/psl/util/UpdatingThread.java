package com.psl.util;

import com.psl.bean.CommonResource;

public class UpdatingThread extends Thread {
private CommonResource commResource;

public UpdatingThread(ThreadGroup tg,CommonResource commResource) {
	super(tg,"Update Thread");
	this.commResource = commResource;
}
@Override
	public void run() {
	int val;
	try{
		commResource.getLock();
		for(int x=0;x<commResource.getSize();x++){
			val=commResource.generateNumber();
			commResource.setNumber(x,val);
		}
		commResource.releaseLock();
	}catch(InterruptedException e){
		e.printStackTrace();
	}
}
}
