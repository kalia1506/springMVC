package com.kcp.initilizer;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import com.kcp.config.RootAppConfig;
import com.kcp.config.WebMVCAppConfig;

public class MyWebAppInitilizer implements WebApplicationInitializer {
	public MyWebAppInitilizer() {
		System.out.println("MyWebAppInitilizer.MyWebAppInitilizer()");
	}

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		System.out.println("MyWebAppInitilizer.onStartup()");
		AnnotationConfigWebApplicationContext pContext = null, cContext = null;
		ContextLoaderListener clListener = null;
		DispatcherServlet ds = null;
		ServletRegistration.Dynamic srd = null;
		// Register the parent container
		pContext = new AnnotationConfigWebApplicationContext();
		pContext.register(RootAppConfig.class);
		// create ContextLoaderListener
		clListener = new ContextLoaderListener(pContext);
		// register listener with ServletContainer
		servletContext.addListener(clListener);

		// create child container
		cContext = new AnnotationConfigWebApplicationContext();
		cContext.register(WebMVCAppConfig.class);
		// create DispatcherServlet
		ds = new DispatcherServlet(cContext);
		// register DispatcherServlet with ServletContainer
		srd = servletContext.addServlet("ds", ds);
		srd.setLoadOnStartup(2);
		srd.addMapping("*.py");
	}

}
