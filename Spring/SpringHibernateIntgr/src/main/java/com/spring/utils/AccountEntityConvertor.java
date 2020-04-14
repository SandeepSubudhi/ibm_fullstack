package com.spring.utils;

public class AccountEntityConvertor {
	
	public static com.spring.hibernate.entity.Account convertAccountJsonToHibernate(com.spring.entity.Account accJson) {
		com.spring.hibernate.entity.Account accDB = new com.spring.hibernate.entity.Account();
		accDB.setAccname(accJson.getAccname());
		accDB.setBalance(accJson.getBalance());
		return accDB;
	}
	
	public static com.spring.entity.Account convertAccountHibernateToJson(com.spring.hibernate.entity.Account accDB) {
		com.spring.entity.Account accJson = new com.spring.entity.Account();
		accJson.setAccname(accDB.getAccname());
		accJson.setBalance(accDB.getBalance());
		accJson.setId(accDB.getId());
		return accJson;
	}

}
