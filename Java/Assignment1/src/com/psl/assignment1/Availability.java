package com.psl.assignment1;

public class Availability {
	
	
	public static int findPosition(int num, int[] nos){
		int pos=-1;
		for(int i=0;i<nos.length;i++){
			if(num==nos[i]){
				pos= i;
			}
		}
		return pos;
	}
	public static void main(String[] args) {
		int[] n={ 1,2,3,4,5};
		int p=findPosition(6, n);
		System.out.println(p);

	}

}
