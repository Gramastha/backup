package com.psl.factThread;



public class Factorial extends Thread{
	
	Number num;
	public Factorial(Number n) {
		super("Factorial");
		num=n;
		
	}
	@Override
	public void run() {
		
			for(int i=0;i<num.size();i++){
				factorial(num.getValue(i));
			}
			
		
	}
	
	
	
	
	
	public void  factorial(int n){
		long result =1;
		
		for(int i=1;i<=n;i++)
			result*=i;
		System.out.println("Factorial of "+n+" is "+result);
	}


}
