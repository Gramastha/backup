package com.psl.phone;

public class PhoneNumber {
	private int areaCode, exchange,extention;
	private int validate(int num){
		int d= String.valueOf(num).length();
		
		return d;
	}
	public PhoneNumber(int areaCode, int exchange, int extention) {
		super();
		
		if(validate(areaCode)==3 && validate(extention)==4 && validate(exchange)==3){
		this.areaCode = areaCode;
		this.exchange = exchange;
		this.extention = extention;
		}
		else{
			System.out.println("Error in input");
		}
	}
	@Override
	public String toString() {
		return "(" + areaCode + ") " + exchange
				+ "-" + extention;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PhoneNumber other = (PhoneNumber) obj;
		if (areaCode != other.areaCode)
			return false;
		if (exchange != other.exchange)
			return false;
		if (extention != other.extention)
			return false;
		return true;
	}
	
	
	
	
}
