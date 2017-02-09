package com.psl.bean;

public class Ointment extends Medicine{

	public Ointment(String cName, String cAddress, String drugName) {
		super(cName, cAddress, "Ointment");
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void displayLabel() {
		super.displayLabel();
		System.out.print(getDrugType()+" \tfor external use only");
	}

}
