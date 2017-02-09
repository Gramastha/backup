package com.psl.cont;

import java.util.Date;

public class Contact {
	
	
	String fname, mname, lname,email,website; 
	
	 long telenum, mobilenum;
	Date dob,anndate;
	Gender gender;
	Address address;
	
	
	
	
	
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	
	@Override
	public String toString() {
		return "Contact [fname=" + fname + ", mname=" + mname + ", lname="
				+ lname + ", email=" + email + ", website=" + website
				+ ", telenum=" + telenum + ", mobilenum=" + mobilenum
				+ ", dob=" + dob + ", anndate=" + anndate + ", gender="
				+ gender + ", address=" + address + "]";
	}
	public Contact(String fname, String mname, String lname, String email,
			String website, long telenum, long mobilenum, Date dob,
			Date anndate, Gender gender, Address address) {
		super();
		this.fname = fname;
		this.mname = mname;
		this.lname = lname;
		this.email = email;
		this.website = website;
		this.telenum = telenum;
		this.mobilenum = mobilenum;
		this.dob = dob;
		this.anndate = anndate;
		this.gender = gender;
		this.address = address;
	}
	public long getTelenum() {
		return telenum;
	}
	public void setTelenum(long telenum) {
		this.telenum = telenum;
	}
	public long getMobilenum() {
		return mobilenum;
	}
	public void setMobilenum(long mobilenum) {
		this.mobilenum = mobilenum;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public Date getAnndate() {
		return anndate;
	}
	public void setAnndate(Date anndate) {
		this.anndate = anndate;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	
	

}
