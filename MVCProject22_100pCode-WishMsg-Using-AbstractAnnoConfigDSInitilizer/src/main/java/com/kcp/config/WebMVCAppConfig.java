package com.kcp.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.kcp.controller")
@PropertySource(value = "classpath:com/kcp/commons/viewspath.properties")
public class WebMVCAppConfig {
	@Autowired
	private Environment env;

	public WebMVCAppConfig() {
		System.out.println("WebMVCAppConfig.WebMVCAppConfig()");
	}

	@Bean
	public InternalResourceViewResolver getIRVR() {
		System.out.println("WebMVCAppConfig.getIRVR()");
		InternalResourceViewResolver irvr = null;
		irvr = new InternalResourceViewResolver();
		irvr.setPrefix(env.getProperty("prefixPath"));
		irvr.setSuffix(env.getProperty("suffixPath"));
		/*irvr.setPrefix("/WEB-INF/pages/");
		irvr.setSuffix(".jsp");*/
		return irvr;
	}
}
