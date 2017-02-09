package com.psl.collection;

public class Student {
	
	String fname,lname;
	public Student() {
		super();
		}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public Student(String fname, String lname) {
		super();
		this.fname = fname;
		this.lname = lname;
	}

	
}
