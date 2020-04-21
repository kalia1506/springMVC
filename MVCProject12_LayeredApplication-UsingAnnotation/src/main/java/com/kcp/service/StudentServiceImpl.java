package com.kcp.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kcp.bo.StudentBO;
import com.kcp.dao.StudentDAO;
import com.kcp.dto.StudentDTO;
@Service("studentService")
public class StudentServiceImpl implements StudentService {
	@Autowired
	private StudentDAO dao;

	public List<StudentDTO> fatchStudent() {
		List<StudentBO> listBO = dao.getAllStudents();
		List<StudentDTO> listDTO = new ArrayList<StudentDTO>();
		listBO.listIterator().forEachRemaining(bo -> {
			StudentDTO dto = new StudentDTO();
			BeanUtils.copyProperties(bo, dto);
			listDTO.add(dto);
		});
		return listDTO;
	}

}
