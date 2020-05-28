package com.kcp.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.kcp.bo.UserBO;
import com.kcp.quries.Queries;

@Repository
public class UserDAOImpl implements UserDAO {
	@Autowired
	private HibernateTemplate ht;

	@SuppressWarnings("deprecation")
	@Override
	public Long validate(UserBO bo) {
		return (Long) (ht.findByNamedParam(Queries.Login, new String[] { "id", "pwd" },
				new Object[] { bo.getUName(), bo.getUPwd() })).get(0);
	}

}
