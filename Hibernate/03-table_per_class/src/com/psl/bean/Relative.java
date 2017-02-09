package com.psl.bean;

import java.sql.Date;

public class Relative extends Contact {
 private String relation;

public Relative(String firstname, String lastname, String email,
		Date dateOfBirth, Address addrs, String relation) {
	super(firstname, lastname, email, dateOfBirth, addrs);
	this.relation = relation;
}

public Relative() {
	super();
}

public String getRelation() {
	return relation;
}

public void setRelation(String relation) {
	this.relation = relation;
}
 
}
