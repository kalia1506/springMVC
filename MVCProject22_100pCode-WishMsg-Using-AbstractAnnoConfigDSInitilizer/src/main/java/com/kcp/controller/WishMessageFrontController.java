package com.kcp.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.kcp.service.WishMeaagaeService;

@Controller
public class WishMessageFrontController {
	@Autowired
	private WishMeaagaeService service;

	public WishMessageFrontController() {
		System.out.println("WishMessageFrontController.WishMessageFrontController()");
	}

	@RequestMapping("/home.py")
	public String welcomePage() {
		System.out.println("WishMessageFrontController.welcomePage()");
		return "home";
	}

	/*@RequestMapping("/wishmessage.py")
	public ModelAndView showWishMessage() {
		String msg = service.getWishMeaasge("kalu");
		return new ModelAndView("result", "message", msg);
	}*/
	@RequestMapping("/about_us.py")
	public String aboutPage() {
		System.out.println("WishMessageFrontController.aboutPage()");
		return "about";
	}

	@RequestMapping("/contactus.py")
	public String contactPage() {
		System.out.println("WishMessageFrontController.contactPage()");
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
	public String showWishMessage(Map<String, Object> map) {
		System.out.println("WishMessageFrontController.showWishMessage()");
		String msg = service.getWishMeaasge("kalu");
		map.put("message", msg);
		return "result";
	}
}
