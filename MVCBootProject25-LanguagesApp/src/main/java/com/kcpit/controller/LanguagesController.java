package com.kcpit.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kcpit.service.FatchLanguagesService;

@Controller
public class LanguagesController {
	@Autowired
	private FatchLanguagesService service;

	@RequestMapping("/home.py")
	public String Showpage() {
		return "welcome";
	}
	@RequestMapping("/langList.py")
	public String ShowLanguages(Map<String,Object> map) throws Exception {
		List<String> langList = service.getAllLanguages();
		map.put("languages", langList);
		return "welcome";
	}
}
