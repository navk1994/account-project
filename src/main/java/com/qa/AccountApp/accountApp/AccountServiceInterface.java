package com.qa.AccountApp.accountApp;

public interface AccountServiceInterface {
	String getAllAccounts();

	String createAnAccount(String account);

	String deleteAnAccount(Long id);

	String findAnAccount(Long id);
	
	
}
