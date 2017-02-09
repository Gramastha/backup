package com.psl.assignment1;

import java.util.ArrayList;

public class FindPrime {
	public static boolean check_prime(int i) {
		if(i<=1) return false;
		for(int j=2;j<(int)(Math.sqrt(i)+1);j++)
		{
			if(i%j==0)
				return false;
		}
		return true;
	}
	
	static ArrayList<Integer> findprime (int lower, int upper){
		ArrayList<Integer> prime=new ArrayList<Integer>();
		for(int i=lower;i<=upper;i++){
			if(check_prime(i)){
				prime.add(i);
			}
		}
		return prime;
	}
		
	
	

	public static void main(String[] args) {
		
		ArrayList<Integer> p= new ArrayList<Integer>();
		
		p= findprime(0,20);
		for(int i:p){
		System.out.println(i);
		}
	}

}
