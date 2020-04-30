package com.kcp.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kcp.bo.PatientBO;
import com.kcp.dao.PatientDAO;
import com.kcp.dto.PatientDTO;

@Service
public class PatientMgmtServiceImpl implements PatientMgmtService {
	@Autowired
	private PatientDAO dao;

	@Override
	public String patientRegister(PatientDTO dto) {
		PatientBO bo = new PatientBO();
		BeanUtils.copyProperties(dto, bo);
		//int count = dao.insert(bo);
		if (dao.insert(bo) == 0) {
			return "data not save";
		} else {
			return " successfully data save";
		}
	}

}
