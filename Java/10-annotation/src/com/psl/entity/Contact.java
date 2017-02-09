package com.psl.entity;

import java.sql.Date;



public class Contact {
	private int contactID;
	private String fname,lstname;
	private Date dob;
	public int getContactID() {
		return contactID;
	}
	public void setContactID(int contactID) {
		this.contactID = contactID;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLstname() {
		return lstname;
	}
	public void setLstname(String lstname) {
		this.lstname = lstname;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public Contact( String fname, String lstname, Date dob) {
		super();
		
		this.fname = fname;
		this.lstname = lstname;
		this.dob = dob;
	}
	public Contact() {
		super();
	}

	
}
