package com.kcp.dao;

import java.util.List;

import com.kcp.bo.EmployeeBO;
import com.kcp.bo.EmployeeRBO;

public interface EmployeeDAO {
	List<EmployeeRBO> getEmployeeData(EmployeeBO bo) throws Exception;
}
