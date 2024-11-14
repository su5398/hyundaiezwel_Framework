package com.boot.jdbc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
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
	
	@GetMapping("/detail")
	public String selectOne(int myno, Model model) {
		
		MyDto dto = biz.selectOne(myno);
		model.addAttribute("dto",dto);
		
		return "myboarddetail";
	}
	
	@GetMapping("/insertform")
	public String insertForm() {
		
		return "myboardinsert";
	}
	
	@PostMapping("/insert")
	public String insertRes(MyDto dto) {
		int res = biz.insert(dto);
		if(res>0) {
			return "redirect:/myboard/list";
		}else {
			return "redirect:/myboard/insertform";
		}
		
	}
	
	/*
	 [1]
	 '/myboard/updateform' 요청을 처리하는 메소드
	 수정하려는 게시글 하나 db로 부터 select 후
	 myboardupdate.jsp로 응답
	 
	 [2]
	 '/myboard/update'로 요청을 처리하는 메소드
	 db에 입력한 내용으로 수정 진행 -
	 		UPDATE MYBOARD SET MYTITLE=#{mytitle}, MYCONTENT=#{mycontent} WHERE MYNO=#{myno}
	 myboardlist.jsp로 응답(수정 실패하면 myboardupdate.jsp로 응답)
	 */
	
	@PostMapping("/updateform")
	public String update(MyDto dto) {
		int res = biz.insert(dto);
		if(res>0) {
			return "redirect:/myboard/list";
		}else {
			return "redirect:/myboard/insertform";
		}
		
	}
	
}
