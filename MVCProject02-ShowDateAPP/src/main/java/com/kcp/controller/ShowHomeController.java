package com.kcp.controller;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class ShowHomeController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView MAV=null;
		Date d=new Date();
		MAV=new ModelAndView();
		MAV.addObject("sysdate",d);
		MAV.addObject("msg", "good morning");
		MAV.setViewName("result");
		//return new ModelAndView("result","sysdate",new Date(120,2,31));
		return MAV;
	}

}
