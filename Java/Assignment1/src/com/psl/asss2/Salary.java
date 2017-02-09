package com.psl.asss2;

public class Salary {
	
	static void calculation(float bs){
		float da,hra,gs,ns,itax;
		
		da= bs*0.1f;
		hra= bs*0.07f;
		gs= bs+da+hra;
		itax= 0.08f*gs;
		ns= gs-itax;
		
		System.out.println(ns);
	}
	public static void main(String[] args){
	Xn.clacXn(2, 3);
	}
	

}

