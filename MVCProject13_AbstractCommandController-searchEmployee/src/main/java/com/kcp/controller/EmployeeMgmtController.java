package com.kcp.controller;

import java.net.BindException;
import java.util.List;
import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kcp.commandClass.EmployeeCommand;
import com.kcp.commandClass.EmployeeCommand1;
import com.kcp.dto.EmployeeDTO;
import com.kcp.dto.EmployeeRDTO;
import com.kcp.service.EmployeeMgmtService;

@Controller
public class EmployeeMgmtController {
	@Autowired
	private EmployeeMgmtService service;

	@RequestMapping("home.py")
	public String showHome() {
		return "home";
	}

	@RequestMapping("searchPage.py")
	public String searchPage() {
		return "searchPage";
	}

	@RequestMapping("search_DataShow.py")
	public String EmployeeSearch(Map<String, Object> map,
								@ModelAttribute EmployeeCommand ecmd,
								BindException be)
			throws Exception {
		// convert commandClass to dto
		EmployeeDTO dto = new EmployeeDTO();
		BeanUtils.copyProperties(ecmd, dto);
		// use service
		List<EmployeeRDTO> listRDTO = service.fatchEmployeeData(dto);
		map.put("listRDTO", listRDTO);
		System.out.println(listRDTO);
		return "search_DataShow";

	}

	@RequestMapping("insertPage.py")
	public String InsertPage() {
		return "insertPage";

	}

	@RequestMapping("insertdata.py")
	public String InsertEmployee(Map<String, Object> map,
								@ModelAttribute EmployeeCommand1 ecmd,
								BindException be)
			throws Exception {
		// convert ecmd to Rdto
		EmployeeRDTO rdto = null;
		rdto = new EmployeeRDTO();
		BeanUtils.copyProperties(ecmd, rdto);
		String msg = service.insertEmployee(rdto);
		map.put("msg", msg);
		System.out.println(msg);
		return "insertdata";

	}
}
