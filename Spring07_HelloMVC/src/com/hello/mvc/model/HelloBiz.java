package com.hello.mvc.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HelloBiz {

	@Autowired
	private HelloDao dao;
	
	public String getHello() {
		return "Hello, "+dao.getHello();
	}
	
}
