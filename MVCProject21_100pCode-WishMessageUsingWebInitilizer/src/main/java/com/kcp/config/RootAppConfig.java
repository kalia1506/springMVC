package com.kcp.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(ServiceConfig.class)
public class RootAppConfig {
	public RootAppConfig() {
		System.out.println("RootAppConfig.RootAppConfig()");
	}
}
