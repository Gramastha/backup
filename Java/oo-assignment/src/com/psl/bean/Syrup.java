package com.psl.bean;

public class Syrup extends Medicine{

	public Syrup(String cName, String cAddress, String drugName) {
		super(cName, cAddress, "Ointment");
		
	}
	
	@Override
	public void displayLabel() {
		super.displayLabel();
		System.out.print(getDrugType()+" \tquantity- as directed by the doctor");
	}

}
