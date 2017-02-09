package com.psl.day5;
import static java.lang.Math.*;

public class FinalFibo {
public static void main(String[] args) {
		
finalfibonacii(5);
			

	}
public static void finalfibonacii(int n){
	
	double d= (1+sqrt(5))/2;
	double d1= (1-sqrt(5))/2;
	
	double f= (pow(d, n)-pow(d1, n))/sqrt(5);
	System.out.println(f);

}
}
