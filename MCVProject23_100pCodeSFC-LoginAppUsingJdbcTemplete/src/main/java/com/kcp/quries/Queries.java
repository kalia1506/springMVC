package com.kcp.quries;

public interface Queries {

	String Login = "select count(*) from userlist where username=? and password=? 	";

}
