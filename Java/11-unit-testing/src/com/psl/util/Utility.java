package com.psl.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Utility {

	public double power(int base,int index){
		double result=1;
		for(int indx= index;indx!=0;){
			result*= base;
			indx= indx>0 ? indx-1:indx+1;
		}
		return index<0?1/result: result;
	}
	
	
public boolean validateEmail(String email) throws Exception{
	if(email.trim().isEmpty() || email==null)  throw new Exception();
		Pattern p= Pattern.compile("[a-z|A-Z]+[A-Z|a-z|0-9|_]*[@][A-Z|a-z|0-9]+[.][a-z]+[.]?[a-z]+");
		Matcher m= p.matcher(email);
		return m.matches();
		}

public long factorial(long number){
	long result=1;
	for(;number>0;number--){
		result *=number;}
		return result;
	
}

}
