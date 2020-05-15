package com.kcp.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = { "com.kcp.service" })
public class ServiceConfig {
	public ServiceConfig() {
		System.out.println("ServiceConfig.ServiceConfig()");
	}
}
