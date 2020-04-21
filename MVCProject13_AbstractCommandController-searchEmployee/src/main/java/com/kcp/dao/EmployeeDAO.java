package com.kcp.dao;

import java.util.List;

import com.kcp.bo.EmployeeBO;
import com.kcp.bo.EmployeeRBO;
import com.kcp.dto.EmployeeRDTO;

public interface EmployeeDAO {
	List<EmployeeRBO> getEmployeeData(EmployeeBO bo) throws Exception;

	int insertData(EmployeeRBO rbo) throws Exception;
}
