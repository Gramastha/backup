package com.psl.code;

public class NumberContainer<T extends Number> {
	private T arr[];
	public double sum(){
		double total=0;
		for(T value: arr){
			total +=value.doubleValue();
		}
		return total;
	}
	
	public double average(){
		return sum()/arr.length;
	}
	
	public boolean hasSameAverage(NumberContainer<?> n){
		return average()==n.average();
	}

}
