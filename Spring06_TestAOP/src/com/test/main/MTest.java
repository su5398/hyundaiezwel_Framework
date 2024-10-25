package com.test.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.test.entity.Shape;

public class MTest {

	public static void main(String[] args) {
		//Triangle, Rectangle 클래스 빈 생성 후
		//.viewSize() 실행
		//aop 적용
		
		ApplicationContext factory =
				new ClassPathXmlApplicationContext("com/test/main/applicationContext.xml");
		
		Shape r = factory.getBean("rectangle", Shape.class);
		Shape t = factory.getBean("triangle", Shape.class);
		
		r.viewSize();
		System.out.println("-------");
		t.viewSize();
		
	}

}
