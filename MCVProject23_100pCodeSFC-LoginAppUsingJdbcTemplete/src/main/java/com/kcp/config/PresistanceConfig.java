package com.kcp.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jndi.JndiObjectFactoryBean;

@Configuration
@ComponentScan(basePackages = "com.kcp.dao")
@PropertySource("classpath:/com/kcp/commons/jndi.properties")
public class PresistanceConfig {
	@Autowired
	private Environment env;
	@Bean
	public JndiObjectFactoryBean getJOFB() {
		JndiObjectFactoryBean jndi = null;
		jndi = new JndiObjectFactoryBean();
		jndi.setJndiName(env.getProperty("jndi"));
		return jndi;
	}
	@Bean
	public JdbcTemplate getTemplate() {
		return new JdbcTemplate((DataSource) getJOFB().getObject());
	}
}
