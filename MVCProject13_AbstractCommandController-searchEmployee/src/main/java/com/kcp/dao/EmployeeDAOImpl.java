package com.kcp.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Repository;

import com.kcp.bo.EmployeeBO;
import com.kcp.bo.EmployeeRBO;
import com.kcp.queries.Jdbc_Query;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {
	@Autowired
	private JdbcTemplate JdbcTemplate;

	@Override
	public List<EmployeeRBO> getEmployeeData(EmployeeBO bo) throws Exception {
		return JdbcTemplate.query(Jdbc_Query.getEmployee, new ResultSetExtractor<List<EmployeeRBO>>() {

			@Override
			public List<EmployeeRBO> extractData(ResultSet rs) throws SQLException, DataAccessException {
				List<EmployeeRBO> listRBO = null;
				EmployeeRBO rbo = null;
				listRBO = new ArrayList<EmployeeRBO>();
				while (rs.next()) {
					rbo = new EmployeeRBO();
					rbo.setEmpno(rs.getInt(1));
					rbo.setEname(rs.getString(2));
					rbo.setEjob(rs.getString(3));
					rbo.setMgr(rs.getInt(4));
					rbo.setHireDate(rs.getDate(5));
					rbo.setEsal(rs.getDouble(6));
					rbo.setComm(rs.getDouble(7));
					rbo.setDeptno(rs.getInt(8));
					listRBO.add(rbo);
				}

				return listRBO;
			}

		}, bo.getEmpno(), bo.getEname(), bo.getEjob(), bo.getEsal());
	}

}
