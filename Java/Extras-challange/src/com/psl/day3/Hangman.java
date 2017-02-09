package com.psl.day3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;



public class Hangman {
	static List<String> words= new ArrayList<String>();
	static int prv=2;
	static Set<Character>guess;
	static void hangman(){
		init();
	int i= words.size();
	int j=((int)(Math.random()*5)%i);
	if(prv==j){
		j=(j+1)%i;
		prv=j;
	}
	startGame(words.get(j));
	
	}

	private static void startGame(String string) {
		String ans="";
		for(int i=0;i<string.length();i++){
			if(string.charAt(i)==' ') ans=ans+" ";
			else if(string.charAt(i)=='-') ans=ans+"-";
			else ans=ans+"_ ";
		}
		System.out.println(ans);
		String input;
		char c;
		guess= new TreeSet<Character>();
		Scanner s= new Scanner(System.in);
		int cnt=0;
		char[] abc= new char[string.length()];
		while(true){
			int j=0;
			int charcount= 0;
			input= s.nextLine();
			for(int i=0;i<abc.length;i++) {
				System.out.print(abc[i]);
				if(abc[i]==string.charAt(i)) {j++;}
				if(j==string.length()-1){ System.out.println("Congo you win correct answer is: "+string); return;} 
			}
			if(input.equalsIgnoreCase(string)){ System.out.println("Congo you win correct answer is: "+string); return;}
			if(input.length()==1){
				c=input.charAt(0);
				
				if(guess.contains(c) && charcount==countChar(string, c)){System.out.println("no try another one"); continue; }
				else{
					if(string.contains(input)){
						
						for(int i=0;i<string.length();i++){
																	
							if(string.charAt(i)==c){abc[i]=c;}
							
							
					}
						
					charcount++;
					}
					else{
						System.out.println("No try again");
						cnt++;
					}
					
				}
			}
			if(cnt==5){ System.out.println(cnt);break;}
		}
		
		System.out.println("You Loss it.......");
		s.close();
		
	}

	public static void main(String[] args) {
	hangman();	
	}
	static void init(){
		words.add("water");
		words.add("abhishek");
		words.add("a i-r");
		words.add("fire");
		
	}

	
	public static int countChar(String str, char ch) {
		
		int count=0, index=0;
		
		assert ch>='a' && ch<='z' || ch<='Z' && ch>='A';
		
		for(; ;){
			index= str.indexOf(ch, index);
			if(index==-1) break;
			index++;
			count++;
		}
		
			
		return count;
}
}
