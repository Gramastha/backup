package com.psl.bean;

import java.sql.Date;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="CONTACT_TYPE",
		discriminatorType=DiscriminatorType.STRING)
public class Contact {

	private int contactId;
	private String firstname, lastname;
	private String email;
	private Date dateOfBirth;
	@Embedded
	private Address addrs;
		
	public Contact() {
		super();
	}
	
	public Address getAddrs() {
		return addrs;
	}

	public void setAddrs(Address addrs) {
		this.addrs = addrs;
	}

	public Contact( String firstname, String lastname,
			String email, Date dateOfBirth, Address addrs) {
		super();
		
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.dateOfBirth = dateOfBirth;
		this.addrs = addrs;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int getContactId() {
		return contactId;
	}
	public void setContactId(int contactId) {
		this.contactId = contactId;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	@Override
	public String toString() {
		return "Contact [dateOfBirth=" + dateOfBirth + ", email=" + email
		+ ", firstname=" + firstname + ", lastname=" + lastname + "]";
	}
	
}
