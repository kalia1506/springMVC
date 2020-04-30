package com.kcp.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kcp.bo.StudentBO;
import com.kcp.dao.StudentDAO;
import com.kcp.dto.StudentDTO;

@Service
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

	@Override
	public StudentDTO FatchStudentbyRNO(Integer rno) {
		StudentBO bo = dao.getStudentbyrno(rno);
		StudentDTO dto = new StudentDTO();
		BeanUtils.copyProperties(bo, dto);
		return dto;
	}

	@Override
	public String fatchUpdateStudentbyRNO(StudentDTO dto) {
		StudentBO bo = new StudentBO();
		BeanUtils.copyProperties(dto, bo);
		Integer count = dao.updateStudentByRNO(bo);
		return (count == 1) ? "Update successfully" : "Update not successfully";
	}

	@Override
	public String removeStudentByRNO(Integer rno) {
		return (dao.deleteStudentByrno(rno) == 1) ? "Delete successfully" : "Delete Not successfully";
	}

	@Override
	public String fatchStudent(StudentDTO dto) {
		StudentBO bo = null;
		bo = new StudentBO();
		BeanUtils.copyProperties(dto, bo);
		return (dao.insertStudent(bo) == 1) ? "Insert Successfully" : "data not inserted";
	}

}
