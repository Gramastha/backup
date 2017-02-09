package com.psl.bean;

public enum CylinderNumber {
		
	one,two,four,six,twelve;
	
	public int getValue(String s){
		if(s.equalsIgnoreCase("one")) return 1;
		
		else if(s.equalsIgnoreCase("two")) return 2;
		
		else if(s.equalsIgnoreCase("four")) return 4;
		
		else if(s.equalsIgnoreCase("six")) return 6;
		
		else if(s.equalsIgnoreCase("twelve")) return 12;
		
		else throw new NumberFormatException("Entered value is not of type Cylinder number");
	}
}

