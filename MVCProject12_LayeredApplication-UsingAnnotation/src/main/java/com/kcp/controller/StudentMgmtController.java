package com.kcp.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kcp.dto.StudentDTO;
import com.kcp.service.StudentService;

@Controller
public class StudentMgmtController {
	@Autowired
	private StudentService service;

	@RequestMapping("liststudent.py")
	public String ShowStudentDetails(Map<String,Object> map){
		List<StudentDTO> listDTO = service.fatchStudent();
		map.put("resultList", listDTO);
		return "StudentList";
	}
	@RequestMapping("home.py")
	public String ShowSearchPage() {
		return "home";
		
	}

}
