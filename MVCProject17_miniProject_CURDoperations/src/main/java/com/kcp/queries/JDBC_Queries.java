package com.kcp.queries;

public interface JDBC_Queries {

	String GET_ALL_STUDENT = "select * from studenttable";
	String get_one_std = "select * from studenttable where rollno=?";
	String upadte_by_rno = "update studenttable set name=?,address=?,totalmark=?,result=?,avgmark=? where rollno=?";
	String delete_by_rno="delete studenttable where rollno=? ";
	String insertStudent="insert into studenttable values(?,?,?,?,?,?)";

}
