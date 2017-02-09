package com.psl.collection;

public class NameClass {
String fname,lname;

public NameClass(String fname, String lname) {
	super();
	this.fname = fname;
	this.lname = lname;
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

@Override
public String toString() {
	return "NameClass [fname=" + fname + ", lname=" + lname + "]";
}

}
