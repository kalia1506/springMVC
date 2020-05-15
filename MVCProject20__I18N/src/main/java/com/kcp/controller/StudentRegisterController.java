package com.kcp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kcp.command.StudentCMD;

@Controller
public class StudentRegisterController {

	@RequestMapping("/home.py")
	public String showPage(@ModelAttribute("stdModel") StudentCMD sCMD) {
		return "Student_Register";

	}
}
