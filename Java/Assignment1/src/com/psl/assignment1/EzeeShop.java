package com.psl.assignment1;

public class EzeeShop {
	
	
	
	public static String[] initProductNames(){
		
		String[] productNames=new String[]{
				"pen",
				"pencil",
				"eraser",
				"blackboard",
				"clipboard"
				
		};
		return productNames;
		
		
		
	}

	static boolean isPresent(String[] productNames, String keyword){
		boolean b=false;
		for(String s: productNames){
		if(s.contains(keyword)){
			b=true;
		}
			
		}
		return b;
		
		
	}
	
	public static void main(String[] args) {
		
		String[] names=initProductNames();
		System.out.println(isPresent(names, "board"));
	}

}
