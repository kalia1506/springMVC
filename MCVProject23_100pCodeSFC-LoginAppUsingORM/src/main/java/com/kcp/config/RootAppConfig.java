package com.kcp.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({PresistanceConfig.class,ServiceConfig.class,AOPConfig.class})
public class RootAppConfig {

}
