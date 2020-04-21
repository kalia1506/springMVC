package com.kcp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kcp.bo.EmployeeBO;
import com.kcp.bo.EmployeeRBO;
import com.kcp.dao.EmployeeDAO;
import com.kcp.dto.EmployeeDTO;
import com.kcp.dto.EmployeeRDTO;

@Service("empService")
public class EmployeeMgmtServiceImpl implements EmployeeMgmtService {
	@Autowired
	private EmployeeDAO dao;

	@Override
	public List<EmployeeRDTO> fatchEmployeeData(EmployeeDTO dto) throws Exception {
		List<EmployeeRBO> listrbo = null;
		List<EmployeeRDTO> listrdto = new ArrayList<EmployeeRDTO>();
		EmployeeBO bo = null;
		bo = new EmployeeBO();
		//convert dto to bo
		BeanUtils.copyProperties(dto, bo);
		//use dto
		listrbo = dao.getEmployeeData(bo);
		//convert listrbo to listrdto
		listrbo.forEach(rbo -> {
			EmployeeRDTO rdto = new EmployeeRDTO();
			BeanUtils.copyProperties(rbo, rdto);
			listrdto.add(rdto);
		});

		return listrdto;
	}

}
