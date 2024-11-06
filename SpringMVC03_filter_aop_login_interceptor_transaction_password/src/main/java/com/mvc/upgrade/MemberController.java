package com.mvc.upgrade;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
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
	@Autowired
	private BCryptPasswordEncoder passwordEncoder;
	
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
			if(passwordEncoder.matches(dto.getMemberpw(), res.getMemberpw())) {
				
				check = true;
				session.setAttribute("login", res);
			}
			
		}
		
		Map<String, Boolean> map = new HashMap<String, Boolean>();
		map.put("check",check);
		System.out.println("check: "+check);
		return map;
	}
	
	@RequestMapping("/registerform.do")
	public String memberInsertForm() {
		logger.info("REGISTER FORM");
		return "mvcregister";
	}
	
	@RequestMapping("/register.do")
	public String memberInsert(MemberDto dto) {
		logger.info("REGISTER");
		
		String encode = passwordEncoder.encode(dto.getMemberpw());
		dto.setMemberpw(encode);
		
		System.out.println(dto.getMemberpw());
		
		int res = biz.insert(dto);
		if(res>0) {
			return "redirect:loginform.do";
		}else {
			return "redirect:registerform.do";
		}
	}
}
