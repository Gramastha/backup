package com.psl.files;

public class ReverseString {
	static String  makeReverse(String str){
		
		String word[]= str.split(" ");
		String rs="";
		
		for(int i=0;i<word.length;i++){
			
			
			for(int k=word[i].length()-1;k>=0;k--){
				rs=rs+ word[i].charAt(k);
			}
			rs+= " ";
			}
			
		
		return rs;
		
	}

}
