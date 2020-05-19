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
@ComponentScan(basePackages = "com.kcp.controller")
@EnableWebMvc
@PropertySource("classpath:/com/kcp/commons/view.properties")
public class WebMVCAppConfig {
	@Autowired
	private Environment env;

	@Bean
	public InternalResourceViewResolver getIRVR() {
		InternalResourceViewResolver irvr = null;
		irvr = new InternalResourceViewResolver();
		irvr.setPrefix(env.getProperty("prefix"));
		irvr.setSuffix(env.getProperty("suffix"));
		return irvr;
	}
}
