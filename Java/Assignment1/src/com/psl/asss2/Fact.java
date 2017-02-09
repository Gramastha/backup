package com.psl.asss2;

public class Fact {
public static int fact(int x){
	int f=1;
	if(x==0 && x==1) return 1;
	for(int i=1;i<x;i++){
		f=f*i;
		return f;
	}
	return 0;
}
}
