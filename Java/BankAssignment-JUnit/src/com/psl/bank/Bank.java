package com.psl.bank;

import java.util.ArrayList;
import java.util.List;

import com.psl.account.Account;
import com.psl.repository.FileUtil;

/**
 * Represents a Finanacial establishment that manages Customer Accounts
 * 
 * 
 */
public class Bank {
	private String name;
	private String branch;
	private List<Account> accountList = null;

	public Bank(String name, String branch) {
		super();
		this.name = name;
		this.branch = branch;
		initAccounts();
	}

	private void initAccounts() {
		

	}

	public List<Account> getAccountList() {
		return accountList;
	}

	public void setAccountList(List<Account> accountList) {
		this.accountList = accountList;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}
}
