package com.boot.jdbc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.boot.jdbc.model.biz.MyBiz;
import com.boot.jdbc.model.dto.MyDto;

@Controller
@RequestMapping("/myboard")
public class MyBoardController {

	@Autowired
	private MyBiz biz;
	
	@GetMapping("/list")
	public String selectList(Model model) {
		List<MyDto> res = biz.selectList();
		model.addAttribute("list",res);
		return "myboardlist";
	}
	
	
}
