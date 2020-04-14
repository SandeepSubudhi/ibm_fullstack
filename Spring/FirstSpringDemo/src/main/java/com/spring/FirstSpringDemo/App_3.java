package com.spring.FirstSpringDemo;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App_3 {

	public static void main(String[] args) {
		AbstractApplicationContext iocContainer = 
				new ClassPathXmlApplicationContext("Beans_simple.xml");
	EmployeeBean ebean = (EmployeeBean)iocContainer.getBean("account");
	System.out.println("Project Name: " + ebean.getProject().getName());






	}

}
