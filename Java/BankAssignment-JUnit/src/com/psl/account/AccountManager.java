package com.psl.account;

import com.psl.bank.Bank;

public class AccountManager {

	private Bank bank;

	public Bank getBank() {
		return bank;
	}

	public AccountManager(Bank bank) {
		this.bank = new Bank("","");
	}

	public void addAccount(Account acct) {
		bank.getAccountList().add(acct);
	}

	public void deleteAccount(Account acct) {
		bank.getAccountList().remove(acct);
	}

	public boolean isValidAccount(Account acct) {
		boolean flag1 = false;
		boolean flag2 = false;
		if (bank.getAccountList().contains(acct))
			flag1 = true;
		else
			flag1 = false;
		return flag2;
	}

}
