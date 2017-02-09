package com.psl.exception;

import java.util.Date;

public class Contact {
	
	
	String fname, lname,email; 
	
	 long telenum, mobilenum;
	Date dob;
	
	
	
	public Contact(String fname, String lname, String email, long telenum,
			long mobilenum, Date dob) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.telenum = telenum;
		this.mobilenum = mobilenum;
		this.dob = dob;
	}



	public boolean validate ( ) throws IncorrectDetailsException, InvalidEmailException{
		boolean flag= false;
		if(!fname.isEmpty() &&!lname.isEmpty() &&!(dob.equals(new Date())) && !email.isEmpty()){
			int c=email.indexOf('@'),d= email.indexOf(".com");
			if(c!=-1 && d!=-1 ){
				if(telenum!=0 || mobilenum!=0){
					flag= true;
					
					return flag;
				}else throw new IncorrectDetailsException("Telephone number or Mobile number must be bentioned");
					
				}
			else throw new InvalidEmailException("Email Id entered is not in correct format");

			
			}
					
		else throw new IncorrectDetailsException("Enter the mandatory details\nfirst name, last name, date of birth, email are mandatory details");
		
		
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
	
		
	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	@Override
	public String toString() {
		return "Contact [fname=" + fname +  ", lname="
				+ lname + ", email=" + email + ", telenum=" + telenum + ", mobilenum=" + mobilenum
				+ ", dob=" + dob + "]";
	}
	/*public Contact(String fname, String lname, String email,
			 long telenum, long mobilenum, Date dob) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.telenum = telenum;
		this.mobilenum = mobilenum;
		this.dob = dob;
	}*/
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
	
	
	

}
