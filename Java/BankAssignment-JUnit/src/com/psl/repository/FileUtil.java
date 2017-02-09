package com.psl.repository;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.psl.account.Account;

public class FileUtil {
	public static List<Account> readAccountData(){
		File file = new File("accounts.txt");
		List<Account> accountList = new ArrayList<Account>();
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			String line="";
			while((line=br.readLine())!=null){
				String[] tokens = line.split(" ");
				Account account = new Account(Integer.parseInt(tokens[0]), tokens[1], tokens[2]);
				accountList.add(account);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return accountList;
	}
}
