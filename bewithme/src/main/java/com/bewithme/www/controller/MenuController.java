package com.bewithme.www.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequestMapping("/menu/*")
@Controller
public class MenuController {

	
	@GetMapping("/home")
	public String home() {
		return "redirect:/main/main";
	}
	@GetMapping("/subject")
	public String subject() {
		return "redirect:/subject/subject";
	}
	@GetMapping("/community")
	public String community() {
		return "redirect:/community/community";
	}
	@GetMapping("/qna")
	public String qna() {
		return "redirect:/qna/qna";
	}
	@GetMapping("/qna_admin")
	public String qna_admin() {
		return "redirect:/qna/admin";
	}
		
}
