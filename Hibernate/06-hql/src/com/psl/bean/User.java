package com.psl.bean;

import java.util.HashSet;
import java.util.Set;

public class User {

	private int userId;
	private String fullname;
	private Set<Account> accounts = new  HashSet<Account>();
	
	
	
	public User() {
		super();
	}
	public User(String fullname) {
		super();
		this.fullname = fullname;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public Set<Account> getAccounts() {
		return accounts;
	}
	public void setAccounts(Set<Account> accounts) {
		this.accounts = accounts;
	}
	
	public void addAccount(Account a){
		getAccounts().add(a);
		a.setOwner(this);
	}
	
}
