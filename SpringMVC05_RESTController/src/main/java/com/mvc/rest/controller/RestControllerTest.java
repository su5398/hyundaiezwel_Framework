package com.mvc.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.mvc.rest.model.biz.RestBiz;

@RestController
public class RestControllerTest {
	
	@Autowired
	private RestBiz biz;
	
}
