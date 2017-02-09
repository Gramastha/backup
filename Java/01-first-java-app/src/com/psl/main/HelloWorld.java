package com.psl.main;

public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("hello eve1");
		
		byte by;
		short srt;
		int i;
		long l;
		float f;
		double d;
		boolean b;
		char c;
		 
		by = 100;
		srt= 0x45;
		i= 0b101010100;
		l=12_34_56_78_900l;
		f=12.65f;
		d= 123.56;
		c='\u004e';
		b=true;
		i=	srt <= 5 ? i++: i--;
		
		System.out.println(by +"\n"+srt+"\n"+i+"\n"+l+"\n"+f+"\n"+d+"\n"+c+"\n"+b);
	}

}
