package com.kcp.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.kcp.bo.UserBO;
import com.kcp.quries.Queries;

@Repository
public class UserDAOImpl implements UserDAO {
	@Autowired
	private JdbcTemplate jt;

	@Override
	public Integer validate(UserBO bo) {
		return jt.queryForObject(Queries.Login,Integer.class,bo.getUName(), bo.getUPwd());
	}

}
