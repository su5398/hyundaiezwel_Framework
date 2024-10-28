package com.test03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {

	public static void main(String[] args) {
		
		ApplicationContext factory = 
				new ClassPathXmlApplicationContext("com/test03/applicationContext.xml");
		
		Person s = factory.getBean("student",Person.class);
		Person t = factory.getBean("teacher",Person.class);
		
		System.out.println("학생");
		s.classWork();
		System.out.println("--------");
		System.out.println("선생");
		t.classWork();
	}

}