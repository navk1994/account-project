package com.qa.AccountApp.accountApp;
import static javax.transaction.Transactional.TxType.REQUIRED;
import static javax.transaction.Transactional.TxType.SUPPORTS;

import java.util.Collection;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import javax.persistence.Query;
import javax.transaction.Transactional;

@Transactional (SUPPORTS)
public class AccountServiceDBImpl {

	@PersistenceContext(unitName = "primary")
	private EntityManager manager;
	
	@Inject
	private JSONUtil util;
	
	
	public Account findAccount(Long id)
	{
		return manager.find(Account.class, id);
	}
	
	
	public String getAllAccounts() 
	{
		Query query = manager.createQuery("Select a FROM Movie a");
		Collection<Account> account = (Collection<Account>) query.getResultList();
return util.getJSONForObject(account);
	}
	
	public Account findAnAccount(Long id) 
	{
		return manager.find(Account.class, id);
	}
	
	@Transactional(REQUIRED)
	
	public String createAnAccount(String account) 
	{
		
		Account aAccount = util.getObjectForJSON(account, Account.class);
		manager.persist(aAccount);
		return "{\"message\": \"Account sucessfully added\"}";

	}
	
	public void updateAnAccount(Long id) 
	{
		Account aAccount = manager.find(Account.class, id);
		
		if(aAccount != null)
		{
			aAccount.setFirstName("POJO");
			aAccount.setLastName("Maximus");
	
			
		}
	}
	
	public String deleteAnAccount(Long id) 
	{
		Account aAccount = manager.find(Account.class, id);
		
		if(aAccount != null) 
		{
			manager.remove(aAccount);
		}
		return "{\"message\": \"account sucessfully deleted\"}";
	
	}		
}
