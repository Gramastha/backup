package com.psl.IO;

import java.io.FileInputStream;

public class Count {
	
	public static void main(String[] args){
		
		try {
			FileInputStream fs= new FileInputStream("abc.txt");
			int i,cnt=0;
			while((i=fs.read())!=-1){
				if(((char)i)==' '|| ((char)i)=='\n'||((char)i)=='.' ){
					cnt++;
				}
			}
			
			System.out.print(cnt);
			fs.close();
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
