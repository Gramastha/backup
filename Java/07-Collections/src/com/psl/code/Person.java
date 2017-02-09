package com.psl.code;

import java.util.Comparator;
import java.util.Date;

public class Person implements Comparable<Person>, Comparator<Person>{
	private String fname,lname;
	private Date dob;
	
	public Person() {
		super();
	}

	@Override
	public String toString() {
		return " ["+ fname +"  "+ lname+"  " +  dob
				+ "]";
	}

	public Person(String fname, String lname, Date dob) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.dob = dob;
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

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	@Override
	public int compareTo(Person arg0) {
		
		return getFname().compareTo(arg0.getFname());
	}

	@Override
	public int compare(Person o1, Person o2) {
		if(o1.getLname().compareTo(o2.getLname())==0){
			return o1.getDob().compareTo(o2.getDob());
		}
		return o1.getLname().compareTo(o2.getLname());
		 
	}
	
}
