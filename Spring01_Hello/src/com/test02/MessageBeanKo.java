package com.test02;

public class MessageBeanKo implements MessageBean {
	public MessageBeanKo() {
		System.out.println("Ko 생성");
	}
	
	@Override
	public void sayHello(String name) {
		System.out.println("안녕하세요, "+name+"님");
	}
}
