package com.spring.FirstSpringDemo;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class OrderApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext iocContainer = 
				new ClassPathXmlApplicationContext("Beans_simple.xml");
			OrderBean OBean = (OrderBean)iocContainer.getBean("Order_1");
			System.out.println(OBean);
	}

}
