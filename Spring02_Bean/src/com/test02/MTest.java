package com.test02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {
	public static void main(String[] args) {
		ApplicationContext factory =
				new ClassPathXmlApplicationContext("com/test02/applicationContext.xml");
		
		Address kim = (Address)factory.getBean("kim");
		System.out.println(kim);
		
		Address hong = (Address)factory.getBean("hong");
		System.out.println(hong);
		
	}
}
