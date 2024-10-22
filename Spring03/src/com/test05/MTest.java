package com.test05;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {

	public static void main(String[] args) {
		ApplicationContext factory =
				new ClassPathXmlApplicationContext("com/test05/applicationContext.xml");
		
		Developer lee = (Developer)factory.getBean("leecj");
		System.out.println(lee);
		
		Engineer kim = factory.getBean("kimcj",Engineer.class);
		System.out.println(kim);
	}

}
