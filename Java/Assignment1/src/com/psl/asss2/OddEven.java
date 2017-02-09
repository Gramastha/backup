package com.psl.asss2;

public class OddEven {
	public static void check(int num){
		if(num%2==0)
			System.out.println("Even");
		
		else
			System.out.println("Odd");
	}

}

class Xn{
	static public void clacXn(float x, int n){
		float s=1;
		for(int i=0;i<n;i++){
			s=s*x;
		}
		
		System.out.println(s);
	}
}
