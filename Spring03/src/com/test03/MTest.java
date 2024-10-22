package com.test03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {

	public static void main(String[] args) {
		ApplicationContext factory=
				new ClassPathXmlApplicationContext("com/test03/applicationContext.xml");
		
		Emp kim = (Emp)factory.getBean("kim");
		Emp lee = (Emp)factory.getBean("lee");
		
		System.out.println(kim);
		System.out.println(lee);
		
	}

}
