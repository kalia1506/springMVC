package com.kcp.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.kcp.service.WishMeaagaeService;

@Controller
public class WishMessageFrontController {
	@Autowired
	private WishMeaagaeService service;

	@RequestMapping("/home.py")
	public String welcomePage() {
		return "home";
	}

	/*@RequestMapping("/wishmessage.py")
	public ModelAndView showWishMessage() {
		String msg = service.getWishMeaasge("kalu");
		return new ModelAndView("result", "message", msg);
	}*/
	@RequestMapping("/about_us.py")
	public String aboutPage() {
		return "about";
	}
	@RequestMapping("/contactus.py")
	public String contactPage() {
		return "contact";
	}

	/*@RequestMapping("/wishmessage.py")
	public String showWishMessage(Model model) {
		String msg = service.getWishMeaasge("kalu");
		model.addAttribute("message", msg);
		return "result";
	}*/
	/*@RequestMapping("/wishmessage.py")
	public String showWishMessage(ModelMap model) {
		String msg = service.getWishMeaasge("kalu");
		model.addAttribute("message", msg);
		return "result";
	}*/
	@RequestMapping("/wishmessage.py")
	public String showWishMessage(Map<String,Object> map) {
		String msg = service.getWishMeaasge("kalu");
		map.put("message", msg);
		return "result";
	}
}
