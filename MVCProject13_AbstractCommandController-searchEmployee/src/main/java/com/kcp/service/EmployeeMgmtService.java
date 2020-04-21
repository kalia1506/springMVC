package com.kcp.service;

import java.util.List;

import com.kcp.dto.EmployeeDTO;
import com.kcp.dto.EmployeeRDTO;

public interface EmployeeMgmtService {
List<EmployeeRDTO> fatchEmployeeData(EmployeeDTO dto)throws Exception;
}
