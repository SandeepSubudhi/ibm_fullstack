package com.spring.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.spring.dao.AccountDAO;
import com.spring.entity.Account;
import com.spring.utils.AccountEntityConvertor;

public class AccountServiceImpl implements AccountService {
	
	@Autowired
	@Qualifier("accountDao")
	private AccountDAO accountDao;
	
	public void save(Account accountJson) {
		accountDao.save(AccountEntityConvertor.convertAccountJsonToHibernate(accountJson));
	}
}
