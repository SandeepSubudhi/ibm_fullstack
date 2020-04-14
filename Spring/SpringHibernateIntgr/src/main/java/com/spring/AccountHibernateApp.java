package com.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("AccountBean.xml")

public class AccountHibernateApp {

	public static void main(String[] args) {
		SpringApplication.run(AccountHibernateApp.class, args);
	}
}
