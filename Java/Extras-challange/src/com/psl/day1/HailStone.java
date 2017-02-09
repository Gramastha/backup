package com.psl.day1;

public class HailStone {
	
	static void printSequence(int n){
		if(n==0){System.out.println("enter number value greater than 1"); return;}
		if(n==1){ System.out.println(n);return;}
		else if(n%2==0){
			System.out.print(n+"\t");
			n=n/2;
			
		}
		else{
			
			System.out.print(n+"\t");
			n=n*3+1;
			
		}
		printSequence(n);
	}
public static void main(String[] args) {
		
		printSequence(0);
	}

}
