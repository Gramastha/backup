package com.psl.assignment1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TickTac {

	public static void main(String[] args) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		char win = 0;
		char[][] c= new char[3][3];
		String[][] s = new String[3][3];
		for(int i=0;i<3;i++){
			s[i]= br.readLine().split(" ");
			
		}
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				c[i][j]= s[i][j].charAt(0);
			}
		}
		char o;
		for(int i=0;i<2;i++){
			
			if(i==0) o='x';
			else o='o';
		
		if((c[0][0]==o && c[0][1]==o && c[0][2]==o) || (c[0][0]==o && c[1][0]==o && c[2][0]==o) || (c[0][0]==o &&c[1][1]==o && c[2][2]==o)){
			win=o;
			break;
			}
		
		
		if(c[0][2]==o){
			if(c[1][1]==o && c[2][0]==o){
				win=o;
				break;
			}
			if(c[1][2]==o && c[2][2]==o){
				win=o;
				break;
				
			}
		}
		
		if(c[1][0]==o && c[1][1]==o && c[1][2]==o){ win=o; break;}
		
		if(c[2][0]==o && c[2][1]==o && c[2][2]==o){ win=o; break;}
		
		if(c[0][1]==o && c[1][1]==o && c[2][1]==o) { win=o; break;}
		
	}
	System.out.println("winner is " +win);

}
}
