package com.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.entity.AccountEntity;

public class AccountDaoImpl implements AccountDao {

	@PersistenceContext
	EntityManager em;
	
	public AccountEntity createAccount(AccountEntity account) {
		em.persist(account);
		return account;
	}

	public AccountEntity readAccount(AccountEntity account) {
		AccountEntity reAccount = em.find(AccountEntity.class, 1 ); //Replace 1 with getID function.
		return reAccount;
	}

	public AccountEntity updateAccount(AccountEntity account) {
		AccountEntity reAccount = em.find(AccountEntity.class, 1); //Replace 1 with getID function
		//Call setter functions over here.
		return reAccount;
	}

	public AccountEntity deleteAccount(AccountEntity account) {
		AccountEntity reAccount = em.find(AccountEntity.class, 1); //Replace 1 with getID function
		em.remove(reAccount);
		return account;
	}
}
