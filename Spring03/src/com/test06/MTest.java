package com.test06;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {

	public static void main(String[] args) {
		ApplicationContext factory =
				new ClassPathXmlApplicationContext("com/test06/applicationContext.xml");
		
		TV tv = (TV)factory.getBean("samsung");
		tv.powerOn();
		tv.volUp();
		tv.volDown();
		tv.powerOff();
		
		factory.getBean("lg");
		
	}

}
