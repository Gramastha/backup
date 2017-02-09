package com.psl.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SortString {
 public static void sort(){
	 BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
	 try {
		
		String s[]= br.readLine().split(" ");

		
	
		
		int bb=s.length-1;
		for(int i=bb; i>0;i--)
		{
			for(int j=0;j<i;j++ )
			{
				if(s[j].compareTo(s[j+1])>0)
				{
					String temp=s[j+1];
					s[j+1]=s[j];
					s[j]=temp;
				}
				
			}
			
			
		}
		
		for (String string : s) {
			System.out.println(string);
	}
		
		
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
 }
 public static void main(String[] args){
		sort();
	}

}
