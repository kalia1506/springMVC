package com.kcp.controller;

import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.kcp.commandClass.PatientCMD;
import com.kcp.dto.PatientDTO;
import com.kcp.service.PatientMgmtService;

@Controller
public class PatientMgmtController {
	@Autowired
	private PatientMgmtService service;

	@GetMapping(value = "/corona.py")
	public String initialPatientPage(@ModelAttribute("patientDetails") PatientCMD pcmd, BindingResult br) {
		System.out.println(pcmd.toString());
		return "patient_register";
	}

	@PostMapping(value = "/corona.py")
	public String patientRegister(Map<String, Object> map, @ModelAttribute("patientDetails") PatientCMD ecmd,
			BindingResult br) {
		PatientDTO dto = new PatientDTO();
		BeanUtils.copyProperties(ecmd, dto);
		System.out.println(dto.toString());
		String msg = service.patientRegister(dto);
		map.put("msg", msg);
		System.out.println(msg);
		return "successPage";

	}

}
