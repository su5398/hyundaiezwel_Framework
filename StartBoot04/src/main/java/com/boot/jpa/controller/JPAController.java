package com.boot.jpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.boot.jpa.model.dao.JpaDao;
import com.boot.jpa.model.entity.JpaEntity;

@Controller
@RequestMapping("/member")
public class JPAController {
	
	@Autowired
	private JpaDao dao;

	@GetMapping("/list")
	public String selectList(Model model) {

		List<JpaEntity> list = dao.findAll();
		model.addAttribute("list",list);
		System.out.println(list.size());
		return "jpalist";
	}
}
