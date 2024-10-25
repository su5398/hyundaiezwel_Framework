package com.test06;

import org.aspectj.lang.annotation.Aspect;

@Aspect
public class MyAspect {
	
	public void myClass() {}
	
	public void before() {
		System.out.println("컴퓨터를 켠다.");
	}
	
	public void after() {
		System.out.println("집에 간다.");
	}
	
}
