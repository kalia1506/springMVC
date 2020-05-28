package com.kcp.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.kcp.bo.UserBO;
import com.kcp.dao.UserDAO;
import com.kcp.dto.UserDTO;

@Service
public class UserMgmtServiceImpl implements UserMgmtService {
	@Autowired
	private UserDAO dao;

	@Transactional(propagation = Propagation.REQUIRED, transactionManager = "hbTxMgr")
	@Override
	public String Login(UserDTO dto) {
		UserBO bo = null;
		bo = new UserBO();
		BeanUtils.copyProperties(dto, bo);
		return ((dao.validate(bo)) == 1 ? "Valid user" : "Invalid User");
	}

}
