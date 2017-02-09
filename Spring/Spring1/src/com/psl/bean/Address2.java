package com.psl.bean;

public class Address2 {
	
	private String street,city,zip, landmark;
	
	public Address2() {
		System.out.println("IN addr2 >>default constructor");

	}
	public Address2(String street, String city, String zip) {
		super();
		System.out.println("IN add2r >>para constructor");
		this.street = street;
		this.city = city;
		this.zip = zip;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		System.out.println("IN addr2 >> SetStreet");
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		System.out.println("IN addr2 >> SetCity");
		this.city = city;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		System.out.println("IN addr2 >> setZip");
		this.zip = zip;
	}
	@Override
	public String toString() {
		return "Address2 [street=" + street + ", city=" + city + ", zip=" + zip
				+ "]";
	}
	public String getLandmark() {
		return landmark;
	}
	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}
	
	

}
