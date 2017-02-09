package com.psl.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.psl.account.Account;
import com.psl.account.AccountManager;
import com.psl.bank.Bank;

public class TestAccountmanager {
	AccountManager accmanager;
	Bank b;
	@Before
	public void init() {
		b=new Bank("", "");
		accmanager= new AccountManager(new Bank("", ""));
		
	}
	
	@Test
	public void testAddAcc(){
		accmanager.addAccount(new Account(12, "abc", "save"));
		Assert.assertTrue(accmanager.getBank().getAccountList().contains(new Account(12, "abc", "save")));
	}
	
	@Test
	public void testIsValid(){
		Account a= new Account(12, "abc", "save");
		accmanager.addAccount(a);
		Assert.assertTrue(accmanager.isValidAccount(a));
	}
	
	@Test
	public void testgetBank(){
		boolean f=false;
		Bank b1= accmanager.getBank();
		if(b1.getBranch().equalsIgnoreCase(b.getBranch()) && b1.getName().equalsIgnoreCase(b.getName())) f=true;
		
		Assert.assertTrue(f);
	}
}
