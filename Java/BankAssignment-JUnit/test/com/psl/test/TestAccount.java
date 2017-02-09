package com.psl.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.psl.account.Account;
import com.psl.account.InsufficientBalanceException;
import com.psl.account.NegativeAmountException;

public class TestAccount {

List<Account> account;
	@Before
	public void init() throws FileNotFoundException{
		account=new ArrayList<Account>();
		Scanner scr= new Scanner(new File("accounts.txt"));
		while(scr.hasNextLine()){
			String[] w= scr.nextLine().split(" ");
			
		account.add(new Account(Integer.parseInt(w[0].trim()), w[1].trim(), w[2].trim()));
		
		}
	}
	
	@Test
	public void testDeposit() throws NegativeAmountException {
		for(int i=0;i<account.size();i++){
			double amt= (i+1)*10;
			double actual,expectedValue=account.get(i).getBalance()+amt;
			account.get(i).deposit(amt);
			actual=account.get(i).getBalance();
			Assert.assertEquals(expectedValue, actual,0);
			
		}
		
	}
	
	@Test(expected=NegativeAmountException.class)
	public void testEXDeposit() throws NegativeAmountException {
		for(int i=0;i<account.size();i++){
			account.get(i).deposit(10);
			Assert.assertEquals(10, 10,0);
			
		}
		
	}
	
	@Test
	public void textWithdraw() throws InsufficientBalanceException {
		for(int i=0;i<account.size();i++){
			
			double actual,expectedValue=account.get(i).getBalance()+100;
			account.get(i).withdraw(100);
			actual=account.get(i).getBalance();
			Assert.assertEquals(expectedValue, actual,0);
			
		}
		
	}
	
	@Test(expected=InsufficientBalanceException.class)
	public void testEXWithdraw() throws InsufficientBalanceException  {
		for(int i=0;i<account.size();i++){
			account.get(i).withdraw(100);
			Assert.assertEquals(10, 10,0);
			
		}
		
	}
	
	@Test
	public void testBalance(){
		for(int i=0;i<account.size();i++){
			
			Assert.assertEquals(-1,account.get(i).getBalance(),0);
			
		}
		
	}

}
