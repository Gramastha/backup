package com.persistent.app;

public class Advisor {
	
	String[] message= new String[5];
	public Advisor() {
	message[0]="Never Say No";
	message[1]="Hardwork is key to success";
	message[2]="Be Dedicated";
	message[3]="Be enthusiastic";
	message[4]="Be persistent";
	}
	
	public void getAdvice(){
		String adv="";
		switch(((int)(Math.random()*12)%5)){
			case 0: adv=message[0];
				break;
			case 1: adv=message[1];
			break;
			case 2: adv=message[2];
			break;
			case 3: adv=message[3];
			break;
			case 4: adv=message[4];
			break;
		}
		
		System.out.println("Advice: "+adv);
	}

}
