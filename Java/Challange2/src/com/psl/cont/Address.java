package com.psl.cont;

public class Address {

	String address,area,city,state,country;
	int pincode;

	public Address(String address, String area, String city, String state,
			String country, int pincode) {
		super();
		this.address = address;
		this.area = area;
		this.city = city;
		this.state = state;
		this.country = country;
		this.pincode = pincode;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "Address [address=" + address + ", area=" + area + ", city="
				+ city + ", state=" + state + ", country=" + country
				+ ", pincode=" + pincode + "]";
	}

	

	
}
