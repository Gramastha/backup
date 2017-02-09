package com.psl.bean;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		AbstractApplicationContext cntxt= new ClassPathXmlApplicationContext("beans.xml");
		
		User u1= (User) cntxt.getBean("user");
		User u2= (User) cntxt.getBean("user1");
		
		System.out.println(u1);
		System.out.println(u2);
		
	}

}
