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

import com.kcp.bo.StudentBO;
import com.kcp.queries.JDBC_Queries;
@Repository("studentDAO")
public class StudentDAOImpl implements StudentDAO {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	
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
