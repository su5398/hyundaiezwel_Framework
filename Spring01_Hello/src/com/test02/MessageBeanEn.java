package com.test02;

public class MessageBeanEn implements MessageBean{
	public MessageBeanEn() {
		System.out.println("En 생성");
	}
	@Override
	public void sayHello(String name) {
		System.out.println("Hello, "+name);
	}
	
}
