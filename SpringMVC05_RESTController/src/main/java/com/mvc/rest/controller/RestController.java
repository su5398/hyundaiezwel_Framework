package com.mvc.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;

import com.mvc.rest.model.biz.RestBiz;

@org.springframework.web.bind.annotation.RestController
public class RestController {
	
	@Autowired
	private RestBiz biz;
	
}
