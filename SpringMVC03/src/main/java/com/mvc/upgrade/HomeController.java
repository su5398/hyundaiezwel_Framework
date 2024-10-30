package com.mvc.upgrade;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mvc.upgrade.model.biz.BoardBiz;
import com.mvc.upgrade.model.dto.BoardDto;

@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Autowired
	private BoardBiz biz;
	
	@RequestMapping("/list.do")
	public String list(Model model) {
		
		logger.info("SELECT LIST");
		
		List<BoardDto> res = biz.selectList();
		model.addAttribute("list",res);
		return "mvclist";
	}
	
	@RequestMapping("/detail.do")
	public String detail(Model model, int myno) {
		logger.info("SELECT ONE");
		
		model.addAttribute("dto",biz.selectOne(myno));
		
		return "mvcdetail";
	}
	
	@RequestMapping("/insertform.do")
	public String insertForm() {
		logger.info("INSERT FORM");
		return "mvcinsert";
	}
	
	@RequestMapping("/insert.do")
	public String insert(BoardDto dto) {
		logger.info("INSERT");
		
		int res = biz.insert(dto);
		
		if(res>0) {
			
			return "redirect:list.do";
		}else {
			return "redirect:insertform.do";
		}
		
	}
}
