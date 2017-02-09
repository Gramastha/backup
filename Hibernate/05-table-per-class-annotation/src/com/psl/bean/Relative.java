package com.psl.bean;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="tbl_relative")
public class Relative extends Contact {
	private String relation;

	public Relative() {
		super();
	}
	
	public Relative(String firstName, String lastName, String email,
			Date dateOfBirth, Address address, String relation) {
		super(firstName, lastName, email, dateOfBirth, address);
		this.relation = relation;
	}

	public String getRelation() {
		return relation;
	}

	public void setRelation(String relation) {
		this.relation = relation;
	}
	
	
}
