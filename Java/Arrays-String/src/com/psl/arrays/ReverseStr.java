package com.psl.arrays;

public class ReverseStr {
	
	
	public static void reverse(String s){
		String word[]= s.split(" ");
		String rs="";
		
		for(int i=0;i<word.length;i++){
			
			
			for(int k=word[i].length()-1;k>=0;k--){
				rs=rs+ word[i].charAt(k);
			}
			rs+= " ";
			}
			
		System.out.println(rs);
	}
	
	
	
}
