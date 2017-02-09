package com.psl.day5;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class FindFile {
	static boolean flag=false;

	public static void main(String[] args) {
		String n=args[1];
	
		if(n.contains("*.")){
		String regex = n.replace("?", ".?").replace("*", "");
		
		Find(args[0], regex);
		}
		else if(n.contains("*")){
			String regex = n.replace("*", "");
			
			Find(args[0], regex);
		}
		else{
			n= n.replace("?","?").replace("*", "");
		
			Find(args[0], n);
		}
		
		if(flag==false)
			System.out.println(args[1]+" not found");

	}
	public static void Find(String s,String fname){
		
		
		File f= new File(s);
		List<File> list= new ArrayList<File>();
		File[] f1= f.listFiles();
		
		if(f1.length==0)
			System.out.println("NO File Exists");
		else{
			for(File s1:f1){
				if(s1.isDirectory()){
					Find(s1.toString(), fname);
				}
				else {
					
					if(s1.getName().contains(fname)){
						list.add(s1);
						flag=true;
					}
					
					
					
				}
				
			}
			
		}
		
		if(flag==true)
			for(File fl:list){
			System.out.println(fl.getName());
			}
		
		
			
	}	

}
