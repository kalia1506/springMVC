package com.kcp.controller;

import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.kcp.commandClass.PatientCMD;
import com.kcp.dto.PatientDTO;
import com.kcp.service.PatientMgmtService;

@Controller
@SessionAttributes("patientDetails")
public class PatientMgmtController {
	@Autowired
	private PatientMgmtService service;
	

	@ModelAttribute("patientDetails")
	public PatientCMD getSessionAtributes() {
		return new PatientCMD();

	}

	@GetMapping(value = "/corona.py")
	public String initialPatientPage( @ModelAttribute("patientDetails") PatientCMD pcmd, BindingResult br) {
		System.out.println(pcmd.toString());
		return "patient_register";
	}

	@PostMapping(value = "/corona.py")
	public String patientRegister(Map<String, Object> map,@Valid @ModelAttribute("patientDetails") PatientCMD ecmd,
			BindingResult br) {
		if(br.hasErrors()) {
			return "patient_register";
		}
		PatientDTO dto = new PatientDTO();
		BeanUtils.copyProperties(ecmd, dto);
		System.out.println(dto.toString());
		String msg = service.patientRegister(dto);
		map.put("msg", msg);
		System.out.println(msg);
		return "successPage";

	}

}
