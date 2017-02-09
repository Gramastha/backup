package com.psl.collections;

import java.util.Set;
import java.util.TreeSet;

public class UniqueChar {
	Set<Character> charset= new TreeSet<Character>();
	private static int j=0;
	private static int cnt=0;
	private static String s="";
	
	public void numberOfUniqueChars(String str){
		
		if(s.equals(str)){
			System.out.println("String Repeated\nNumber of unique chars at srting from cache is: "+cnt);
			return;
		}
		else{
			charset.clear();
		for(int i=0;i<str.length();i++){
			charset.add(str.charAt(i));
			
		}
		if(j==0){
		s=str;
		cnt=charset.size();
		j++;
		}
		System.out.println("Number of unique characters in the string-"+str+" are: "+charset.size());
		}
		
	}

}
