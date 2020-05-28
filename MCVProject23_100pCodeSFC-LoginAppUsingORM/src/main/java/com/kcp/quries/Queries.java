package com.kcp.quries;

public interface Queries {

	String Login = "select count(*) from UserBO where uName=:id and uPwd=:pwd";

}
