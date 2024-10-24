package com.test01.anno;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {

	public static void main(String[] args) {
		
		ApplicationContext factory =
				new ClassPathXmlApplicationContext("com/test01/anno/applicationContext.xml");
		
		MyNickName myNick = factory.getBean("myNickName",MyNickName.class);
		System.out.println(myNick);
		
	}

}
