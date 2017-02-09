package com.psl.code;

import com.psl.bean.CommonResource;
import com.psl.bean.SharedResource;
import com.psl.util.AccessCommonResource;
import com.psl.util.MyRunnable;
import com.psl.util.MyThread;
import com.psl.util.ReadCounter;
import com.psl.util.RunCounter;
import com.psl.util.UpdatingThread;

public class Main {
	public static void main(String args[]){
		ThreadGroup tg= new ThreadGroup("Abhi");
		CommonResource commonResource;
		commonResource=new CommonResource();
		
		UpdatingThread update= new UpdatingThread(tg,commonResource);
		AccessCommonResource access= new AccessCommonResource(tg, commonResource);
		
		
		update.start();
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		access.start();
	}

}


/*
 * synchronized
 * 
 * 
 * 
		
		SharedResource sharedResource;
		
		sharedResource = new SharedResource(100_00_0000000l);
		RunCounter runCounter= new RunCounter(sharedResource);
		
		ReadCounter readCounter= new ReadCounter(sharedResource);
		runCounter.start();
		
		
			
			readCounter.start();
		
		
	
 */

/*
 * threads
 * 
 * 
		MyThread t1= new MyThread("First");
		MyThread t2= new MyThread("Second");
		MyThread t3= new MyThread("third");
		
		MyRunnable r1= new MyRunnable("fourth");
		MyRunnable r2= new MyRunnable("fifth");
		MyRunnable r3= new MyRunnable("sixth");
		
		
		t1.start();
		
		t2.start();
		
		t3.start();
	
		
	
	
 */