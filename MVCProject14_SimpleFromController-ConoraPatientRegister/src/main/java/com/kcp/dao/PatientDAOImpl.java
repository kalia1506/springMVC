package com.kcp.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.kcp.bo.PatientBO;
import com.kcp.queries.Jdbc_Quries;
@Repository
public class PatientDAOImpl implements PatientDAO {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	
	@Override
	public Integer insert(PatientBO bo) {
		System.out.println(bo.toString());
		return jdbcTemplate.update(Jdbc_Quries.save_data,bo.getPName(),bo.getDOB(),
								bo.getGender(),bo.getPhoneNo(),bo.getAddress());
	}

}
