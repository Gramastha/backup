package com.psl.day1;

public class Great {
	
	static void printGreater(int a,int b, int c){
		int j= a>b?a:b;
		System.out.println("Greatest= "+(j>c?j:c));
	}

	public static void main(String[] args) {
		
		printGreater(100, 2000, 30);
	}

}
