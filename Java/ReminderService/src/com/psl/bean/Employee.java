package com.psl.bean;

import java.util.Comparator;
import java.util.Date;

public class Employee implements Comparable<Employee>,Comparator<Employee>{
	@Override
	public String toString() {
		return "Employee [employeeid=" + employeeid + ", employeeName="
				+ employeeName + ", birthDate=" + birthDate
				+ ", anniversaryDate=" + anniversaryDate + "]";
	}
	private int employeeid;
	private String employeeName;
	private Date birthDate;
	private Date anniversaryDate;
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public int getEmployeeid() {
		return employeeid;
	}
	public void setEmployeeid(int employeeid) {
		this.employeeid = employeeid;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	public Date getAnniversaryDate() {
		return anniversaryDate;
	}
	public void setAnniversaryDate(Date anniversaryDate) {
		this.anniversaryDate = anniversaryDate;
	}
	public Employee(int employeeid, String employeeName, Date birthDate,
			Date anniversaryDate) {
		super();
		this.employeeid = employeeid;
		this.employeeName = employeeName;
		this.birthDate = birthDate;
		this.anniversaryDate = anniversaryDate;
	}
	@Override
	public int compareTo(Employee arg0) {
		
		if(employeeid==arg0.getEmployeeid()) return 0;
		else if(employeeid>arg0.getEmployeeid()) return -1;
		else return 1;
		
	}
	@Override
	public int compare(Employee arg0, Employee arg1) {
		return arg0.getEmployeeName().compareTo(arg1.getEmployeeName());
	}
	

}
