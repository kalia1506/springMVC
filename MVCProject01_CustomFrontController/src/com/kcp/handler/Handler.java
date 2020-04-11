package com.kcp.handler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Handler {
 String handle(HttpServletRequest req,HttpServletResponse res) throws Exception;
}
