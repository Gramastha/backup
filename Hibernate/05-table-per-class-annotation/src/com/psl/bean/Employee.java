package com.psl.bean;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="tbl_employee")
public class Employee extends Contact {
	private String employeeCode, designation;

	public Employee() {
		super();
	}

	public Employee(String firstName, String lastName, String email,
			Date dateOfBirth, Address address, String employeeCode,
			String designation) {
		super(firstName, lastName, email, dateOfBirth, address);
		this.employeeCode = employeeCode;
		this.designation = designation;
	}

	public String getEmployeeCode() {
		return employeeCode;
	}

	public void setEmployeeCode(String employeeCode) {
		this.employeeCode = employeeCode;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	
}
