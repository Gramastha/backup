package com.psl.anim;



public class AnimationThread extends Thread{
private String[] str= {"-_-", "+_+", "^_^" ,"*_*"};

@Override
	public void run() {
		for(int j=0;j<1000;j++){
			switch ((int)(Math.random()*j)%4) {
			case 0:
				for(int i = 0; i < 80; i++)
				{
				    System.out.println(" ");
				}
					
				
				
				break;
			case 1:for(int i = 0; i < 80; i++)
			{
			    System.out.println(" ");
			}
				
					System.out.println(str[1]);
				
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				break;
			case 2:
				for(int i = 0; i < 80; i++)
				{
				    System.out.println(" ");
				}
					System.out.println(str[2]);
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				
				break;
			case 3:
				for(int i = 0; i < 80; i++)
				{
				    System.out.println(" ");
				}
					System.out.println(str[3]);
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}			
				break;
			}
		}
	}

}
