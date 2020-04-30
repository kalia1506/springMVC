package com.kcp.dao;

import java.util.List;

import com.kcp.bo.StudentBO;

public interface StudentDAO {
	List<StudentBO> getAllStudents();

	StudentBO getStudentbyrno(Integer rno);

	Integer updateStudentByRNO(StudentBO bo);
	
	Integer deleteStudentByrno(Integer rno);
	
	Integer insertStudent(StudentBO bo);
}
