package com.kcp.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.kcp.bo.StudentBO;
import com.kcp.queries.JDBC_Queries;

public class StudentDAOImpl implements StudentDAO {
	private JdbcTemplate jdbcTemplate;

	public StudentDAOImpl(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public List<StudentBO> getAllStudents() {
		return jdbcTemplate.query(JDBC_Queries.GET_ALL_STUDENT, new StudentExtecter());
	}

	public class StudentExtecter implements ResultSetExtractor<List<StudentBO>> {

		public List<StudentBO> extractData(ResultSet rs) throws SQLException, DataAccessException {
			List<StudentBO> listBO=null;
			listBO=new ArrayList<StudentBO>();
			StudentBO bo=null;
			while(rs.next()) {
				bo=new StudentBO();
				bo.setName(rs.getString("NAME"));
				bo.setRollNo(rs.getInt("ROLLNO"));
				bo.setAddress(rs.getString("ADDRESS"));
				bo.setTotalMark(rs.getInt("TOTALMARK"));
				bo.setResult(rs.getString("RESULT"));
				bo.setAvgMark(rs.getDouble("AVGMARK"));
				listBO.add(bo);
			}
			return listBO;
		}

	}
}
