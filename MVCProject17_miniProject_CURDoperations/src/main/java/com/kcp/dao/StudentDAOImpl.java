package com.kcp.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.kcp.bo.StudentBO;
import com.kcp.queries.JDBC_Queries;
@Repository
public class StudentDAOImpl implements StudentDAO {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	
	public List<StudentBO> getAllStudents() {
		return jdbcTemplate.query(JDBC_Queries.GET_ALL_STUDENT, new StudentExtecter());
	}

	public class StudentExtecter implements ResultSetExtractor<List<StudentBO>> {

		public List<StudentBO> extractData(ResultSet rs) throws SQLException, DataAccessException {
			List<StudentBO> listBO = null;
			listBO = new ArrayList<StudentBO>();
			StudentBO bo = null;
			while (rs.next()) {
				bo = new StudentBO();
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

	@Override
	public StudentBO getStudentbyrno(Integer rno) {
		return jdbcTemplate.queryForObject(JDBC_Queries.get_one_std, new RowMapper<StudentBO>() {
			@Override
			public StudentBO mapRow(ResultSet rs, int rowNum) throws SQLException {
				StudentBO bo = null;
				bo = new StudentBO();
				bo.setName(rs.getString(1));
				bo.setRollNo(rs.getInt(2));
				bo.setAddress(rs.getString(3));
				bo.setTotalMark(rs.getInt(4));
				bo.setResult(rs.getString(5));
				bo.setAvgMark(rs.getDouble(6));
				return bo;
			}
		}, rno);
	}

	@Override
	public Integer updateStudentByRNO(StudentBO bo) {
		return jdbcTemplate.update(JDBC_Queries.upadte_by_rno,
				bo.getName(),bo.getAddress(),bo.getTotalMark(),
				bo.getResult(),bo.getAvgMark(),bo.getRollNo());
	}

	@Override
	public Integer deleteStudentByrno(Integer rno) {
		return jdbcTemplate.update(JDBC_Queries.delete_by_rno,rno);
	}

	@Override
	public Integer insertStudent(StudentBO bo) {
		return jdbcTemplate.update(JDBC_Queries.insertStudent,
				bo.getName(),bo.getRollNo(),bo.getAddress(),bo.getTotalMark(),
				bo.getResult(),bo.getAvgMark());
	}
}
