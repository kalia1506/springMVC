package com.kcp.initilizer;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.kcp.config.RootAppConfig;
import com.kcp.config.WebMVCAppConfig;

public class MyWebAppInitilizer extends AbstractAnnotationConfigDispatcherServletInitializer {
	public MyWebAppInitilizer() {
		System.out.println("MyWebAppInitilizer.MyWebAppInitilizer()");
	}

	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println("MyWebAppInitilizer.getRootConfigClasses()");
		return new Class[] {RootAppConfig.class};
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("MyWebAppInitilizer.getServletConfigClasses()");
		return  new Class[] {WebMVCAppConfig.class};
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println("MyWebAppInitilizer.getServletMappings()");
		return new String[] {"*.py"};
	}



}
