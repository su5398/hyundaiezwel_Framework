package com.test.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MyAspect {
	
	@Before("execution(public * *(..))")
	public void before() {
		System.out.println("도형의 넓이를 구한다.");
	}
	
	@After("execution(public * *(..))")
	public void after() {
		System.out.println("도형의 넓이를 출력한다.");
	}
}
