package com.psl.bean;

public class Medicine {
	private String cName, cAddress,drugType;

	public Medicine(String cName, String cAddress, String drugName) {
		super();
		this.cName = cName;
		this.cAddress = cAddress;
		this.drugType = drugName;
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	public String getcAddress() {
		return cAddress;
	}

	public void setcAddress(String cAddress) {
		this.cAddress = cAddress;
	}

	public String getDrugType() {
		return drugType;
	}

	public void setDrugType(String drugType) {
		this.drugType = drugType;
	}
	
	public void displayLabel(){
		
		System.out.println("Company name: "+ cName+" , Company address: "+cAddress);
		
	}
}
