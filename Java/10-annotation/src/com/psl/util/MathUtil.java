package com.psl.util;

public class MathUtil {
	public long factorial(int n){
		long result =1;
		if(n==1) return 1;
		for(int i=1;i<=n;i++)
			result*=i;
		return result;
	}

}
