package com.psl.beans;

public class Employee {
private int EmpId;
private String EmpName, Emppassword,designation;


public Employee(int empId, String empName, String emppassword,
		String designation) {
	super();
	EmpId = empId;
	EmpName = empName;
	Emppassword = emppassword;
	this.designation = designation;
}

public int getEmpId() {
	return EmpId;
}
public void setEmpId(int empId) {
	EmpId = empId;
}
public String getEmpName() {
	return EmpName;
}
public void setEmpName(String empName) {
	EmpName = empName;
}
public String getEmppassword() {
	return Emppassword;
}
public void setEmppassword(String emppassword) {
	Emppassword = emppassword;
}
public String getDesignation() {
	return designation;
}
public void setDesignation(String designation) {
	this.designation = designation;
}


@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + EmpId;
	return result;
}






@Override
public String toString() {
	return "[Id=" + EmpId + ", Name=" + EmpName
			+ ", Password=" + Emppassword + ", designation=" + designation
			+ "]";
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Employee other = (Employee) obj;
	if (EmpId != other.EmpId)
		return false;
	return true;
}


}
