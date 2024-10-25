package com.test.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {

	public static void main(String[] args) {
		//Triangle, Rectangle 클래스 빈 생성 후
		//.viewSize() 실행
		//aop 적용
		
		ApplicationContext factory =
				new ClassPathXmlApplicationContext("com/test/main/applicationContext.xml");
		
		
		
	}

}
