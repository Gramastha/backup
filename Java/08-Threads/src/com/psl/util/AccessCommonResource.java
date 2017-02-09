package com.psl.util;

import com.psl.bean.CommonResource;

public class AccessCommonResource extends Thread{
	private CommonResource commResource;

	public AccessCommonResource(ThreadGroup tg,CommonResource commResource) {
		super(tg,"Access Thread");
		this.commResource = commResource;
	}
	@Override
		public void run() {
		try{
			commResource.getLock();
			for(int x=0;x<commResource.getSize();x++){
				System.out.print(commResource.getNumber(x)+"\t");
			}commResource.releaseLock();
		}catch(InterruptedException e){
			e.printStackTrace();
		}
	}
}
