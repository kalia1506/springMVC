package com.kcp.queries;

public interface Jdbc_Query {

	String getEmployee ="(select * from emp where (empno is not null and empno like ?)"
												+ " or ( ename is not null and ename like ?) "
												+ "or (job is not null and job like ?) "
												+ " or ( sal is not null and sal>=?))";

}
