package com.psl.bean;

public enum Strokes {
two,four;
public int getValue(String s){
	
	
	 if(s.equalsIgnoreCase("two")) return 2;
	
	else if(s.equalsIgnoreCase("four")) return 4;
			
	else throw new NumberFormatException("Entered value is not of type Cylinder number");
}
}
