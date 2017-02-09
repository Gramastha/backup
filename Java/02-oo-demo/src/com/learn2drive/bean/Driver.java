package com.learn2drive.bean;

import java.util.Date;
import java.util.Set;

public class Driver {
	private String fullName;
	private Date dateOfBirth;
	private License license;
	private Set<Car> cars;
	
	
	
	
	public Driver() {
		super();
	}
	public Driver(String fullName, Date dateOfBirth, License license) {
		super();
		this.fullName = fullName;
		this.dateOfBirth = dateOfBirth;
		this.license = license;
	}
	
	
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public License getLicense() {
		return license;
	}
	public void setLicense(License license) {
		this.license = license;
	}
	public Set<Car> getCars() {
		return cars;
	}
	public void setCars(Set<Car> cars) {
		this.cars = cars;
	}
	

}
