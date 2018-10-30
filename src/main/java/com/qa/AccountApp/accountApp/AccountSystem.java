package com.qa.AccountApp.accountApp;

import java.util.HashMap;

public class AccountSystem {
	
	HashMap<Integer, Account> bankAccounts = new HashMap<Integer, Account>();
	static int counter = 0;
	
	public void addAccount(int counter, String firstName, String secondName, String accountNumber) {
		
		bankAccounts.put(counter, new Account(firstName, secondName, accountNumber));
		counter++;
	}
	
	public void getAccount(int id) 
	{
		System.out.println(bankAccounts.get(id));	
	}
	
	
	
	
	
	
	
	
}
