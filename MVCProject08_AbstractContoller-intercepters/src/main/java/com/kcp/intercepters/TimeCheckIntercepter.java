package com.kcp.intercepters;

import java.util.Calendar;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class TimeCheckIntercepter implements HandlerInterceptor {
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		System.out.println("TimeCheckIntercepter.preHandle()");
		Calendar calendar = null;
		RequestDispatcher rd = null;
		calendar = Calendar.getInstance();
		int hr = calendar.get(Calendar.HOUR_OF_DAY);
		System.out.println(hr);
		if (hr <23 && hr >= 24) {
			rd = request.getRequestDispatcher("/timeouterror.jsp");
			rd.forward(request, response);
			return false;
		} else {
			
			return true;
		}
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		System.out.println("TimeCheckIntercepter.postHandle()");
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		System.out.println("TimeCheckIntercepter.afterCompletion()");
	}
}
