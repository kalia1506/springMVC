package com.kcp.controller;

import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.kcp.command.UserCommand;
import com.kcp.dto.UserDTO;
import com.kcp.service.UserMgmtService;

@Controller
@SessionAttributes("userCMD")
public class UserMgmtController {
	@Autowired
	private UserMgmtService service;

	@ModelAttribute("userCMD")
	public UserCommand getUcmd() {
		return new UserCommand();

	}

	@GetMapping("/login.py")
	public String LoginPage(@ModelAttribute("userCMD") UserCommand UCMD) {
		return "Loginpage";
	}

	@PostMapping("/login.py")
	public String authenticate(@ModelAttribute("userCMD") UserCommand UCMD, Map<String, Object> map, BindingResult br) {

		UserDTO dto = new UserDTO();
		BeanUtils.copyProperties(UCMD, dto);
		String msg = service.Login(dto);
		map.put("msg", msg);
		return "Loginpage";

	}
}
