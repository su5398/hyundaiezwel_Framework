package com.mvc.upgrade;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mvc.upgrade.model.biz.MemberBiz;
import com.mvc.upgrade.model.dto.MemberDto;

@Controller
public class MemberController {
	
	private Logger logger = LoggerFactory.getLogger(MemberController.class);
	
	@Autowired
	private MemberBiz biz;
	
	@RequestMapping("/loginform.do")
	public String loginForm() {
		logger.info("LOGIN FORM");
		return "mvclogin";
	}
	
	@RequestMapping("/ajaxlogin.do")
	@ResponseBody
	public Map<String, Boolean> ajaxLogin(@RequestBody MemberDto dto, HttpSession session) {
		logger.info("LOGIN");
		
		MemberDto res = biz.login(dto);
		
		boolean check = false;
		if(res != null) {
			check = true;
			session.setAttribute("login", res);
		}
		
		Map<String, Boolean> map = new HashMap<String, Boolean>();
		map.put("check",check);
		System.out.println("check: "+check);
		return map;
	}
}
