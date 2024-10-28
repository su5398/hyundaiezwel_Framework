package com.hello.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hello.mvc.model.HelloBiz;

@Controller
public class HelloController {

	@Autowired
	private HelloBiz biz;
	
	@RequestMapping("/hello.do")
	public String getHello(Model model) {
		
		model.addAttribute("msg",biz.getHello());
		
		return "/WEB-INF/views/hello.jsp";
	}
	
}
