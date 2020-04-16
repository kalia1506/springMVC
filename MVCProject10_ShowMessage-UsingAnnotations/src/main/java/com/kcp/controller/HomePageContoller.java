package com.kcp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomePageContoller {
	@RequestMapping("/home.py")
	public String homePage() {
		return "welcome";

	}
}
