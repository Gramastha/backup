package com.psl.bean;

public class Tablet extends Medicine{

	public Tablet(String cName, String cAddress, String drugName) {
		super(cName, cAddress, "Tablet");
		
		
		
	}

	@Override
	public void displayLabel() {
		super.displayLabel();
		System.out.print(getDrugType()+" \tstore in a cool dry place");
	}
	
	

}
