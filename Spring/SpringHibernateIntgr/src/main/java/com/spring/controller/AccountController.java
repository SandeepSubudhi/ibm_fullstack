package com.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.spring.entity.Account;
import com.spring.entity.Employee;
import com.spring.services.AccountService;

@RestController
public class AccountController {
	
	@Autowired
	private AccountService accountService;
	
	@RequestMapping(value="/account", method=RequestMethod.POST, produces=MediaType.APPLICATION_JSON_VALUE)
	public String addEmployee(@RequestBody Account account) {
		accountService.save(account);
		return "{ \"result\": \"Success\"}";
	}
}
