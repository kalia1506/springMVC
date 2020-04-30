package com.kcp.service;

import java.util.List;

import com.kcp.dto.StudentDTO;

public interface StudentService {
	List<StudentDTO> fatchStudent();

	StudentDTO FatchStudentbyRNO(Integer rno);

	String fatchUpdateStudentbyRNO(StudentDTO dto);

	String removeStudentByRNO(Integer rno);

	String fatchStudent(StudentDTO dto);
}
