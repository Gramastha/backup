package com.psl.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.junit.Assert;
import org.junit.Test;

import com.psl.account.Account;
import com.psl.repository.FileUtil;

public class TestFileUtil {
	List<Account> account;
	static List<Account>fileaccount;
	
	@Test
	public void testRead(){
		fileaccount= new ArrayList<Account>();
		for(Account a:FileUtil.readAccountData()){
			fileaccount.add(a);
		}
		Assert.assertFalse(fileaccount.isEmpty());
	}
	
	@Test
	public void testValues() throws FileNotFoundException{
		boolean flag=false;
		account=new ArrayList<Account>();
		Scanner scr= new Scanner(new File("accounts.txt"));
		while(scr.hasNextLine()){
			String[] w= scr.nextLine().split(" ");
			
		account.add(new Account(Integer.parseInt(w[0].trim()), w[1].trim(), w[2].trim()));
		
		}
		
		for(Account a: account){
			for(Account ab: fileaccount){
				//System.out.println(a.getAccountNum()+"--"+ab.getAccountNum());
				if(a.getAccountNum()==ab.getAccountNum() && a.getBalance()==ab.getBalance() && a.getCustName().equalsIgnoreCase(ab.getCustName()) && a.getType().equalsIgnoreCase(ab.getType()));
				flag=true;
			}
		}
		Assert.assertTrue(flag);
	
	}
	

}
