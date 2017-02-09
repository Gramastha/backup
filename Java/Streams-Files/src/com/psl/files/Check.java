package com.psl.files;

public class Check {

	public static void main(String[] args) {
		System.out.println(check("Hello this is Persistent . The Persistent is the Leading IT comp.", "the"));

	}
	static int check(String sentence,String word){
		String s[]= sentence.split(" ");
		int cnt=0;
		for(int i=0;i<s.length;i++)
			if(s[i].equalsIgnoreCase(word))
				cnt++;
		return cnt;
		
	}

}
