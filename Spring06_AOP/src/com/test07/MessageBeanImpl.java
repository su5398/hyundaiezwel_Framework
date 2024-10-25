package com.test07;

public class MessageBeanImpl implements MessageBean{
	
	private String name;
	
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void sayHello() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Hello, " + name);
		
	}

	@Override
	public void sayHi() {
		System.out.println("Hi, "+name);
	}
	
	
	
}
