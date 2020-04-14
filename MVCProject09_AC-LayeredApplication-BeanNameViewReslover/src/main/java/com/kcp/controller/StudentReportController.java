package com.kcp.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.kcp.dto.StudentDTO;
import com.kcp.service.StudentService;

public class StudentReportController extends AbstractController {
	private StudentService service;

	public StudentReportController(StudentService service) {
		this.service = service;
	}

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		List<StudentDTO> listDTO = service.fatchStudent();
		if (request.getParameter("type").equalsIgnoreCase("xls")) {
			return new ModelAndView("XLSview", "resultList", listDTO);
		} else {
			return new ModelAndView("PDFview", "resultList", listDTO);
		}
	}

}
