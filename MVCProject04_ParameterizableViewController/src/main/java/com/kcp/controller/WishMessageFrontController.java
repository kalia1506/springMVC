package com.kcp.controller;

import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class WishMessageFrontController extends AbstractController {

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		String WishMsg=null;
		Calendar calendar=Calendar.getInstance();
		int hr=calendar.get(Calendar.HOUR_OF_DAY);
		if(hr<=12) {
			WishMsg="good morning";
		}else if(hr<=16) {
			WishMsg="good afternoon";
		}else if(hr<=20) {
			WishMsg="good evning";
		}else {
			WishMsg="good night";
		}
		return new ModelAndView("result","message",WishMsg);
		
	}
}
