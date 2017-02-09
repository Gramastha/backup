package com.psl.bean;

import java.util.HashSet;
import java.util.Set;

public class Qualification {

	private int qualification_id;
	private String name;
	private Set<Profile> profiles= new HashSet<Profile>();
	
	public Qualification() {
		
	}
	
	
	public Qualification(String name) {
		super();
	
		this.name = name;
		
	}


	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setQualification_id(int qualification_id) {
		this.qualification_id = qualification_id;
	}
	public int getQualification_id() {
		return qualification_id;
	}
	public void setProfiles(Set<Profile> profiles) {
		this.profiles = profiles;
	}
	public Set<Profile> getProfiles() {
		return profiles;
	}
	
}
