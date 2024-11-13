package com.boot.jdbc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.boot.jdbc.model.biz.MyBiz;

@Controller
public class MyBoardController {

	@Autowired
	private MyBiz biz;
	
	
	
}
