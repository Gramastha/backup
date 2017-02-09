package com.psl.code;

public class AadharMAp implements Comparable<AadharMAp> {
	private String number;
	private String mobileNumber;
	public AadharMAp() {
		super();
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((number == null) ? 0 : number.hashCode());
		return result;
	}
	
	public AadharMAp(String number, String mobileNumber) {
		super();
		this.number = number;
		this.mobileNumber = mobileNumber;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AadharMAp other = (AadharMAp) obj;
		if (number == null) {
			if (other.number != null)
				return false;
		} else if (!number.equals(other.number))
			return false;
		return true;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	@Override
	public int compareTo(AadharMAp arg0) {
		
		return getNumber().compareTo(arg0.getNumber());
	}
	
}