package com.kcp.dao;

import java.util.List;

import com.kcp.bo.StudentBO;

public interface StudentDAO {
	List<StudentBO> getAllStudents();
}
