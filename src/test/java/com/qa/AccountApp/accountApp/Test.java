package com.qa.AccountApp.accountApp;

import java.util.HashMap;

import junit.framework.TestCase;

public class Test extends TestCase {
	
AccountSystem accountSystem = new AccountSystem();
HashMap<Integer, Account> bankAccounts = new HashMap<Integer, Account>();
@org.junit.Test 
public void firstNameTest() 
{
    int counter = 1;
    
    bankAccounts.put(counter, new Account("John", "", accountNumber));
    accountSystem.addAccount(0, "John", "Bishop", "19202711");
    accountSystem.addAccount(1, "Perry", "Bishop", "19122711");	
    
    for(int i = 0; i < accountSystem)
    if ( accoun.containsKey("Charity")
    
  	accountSystem.getAccount(1);
  	assertEquals(1, counter);
	}
}
