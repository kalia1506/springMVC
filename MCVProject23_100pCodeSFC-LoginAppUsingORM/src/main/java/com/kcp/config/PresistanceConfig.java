package com.kcp.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.core.env.Environment;
import org.springframework.jndi.JndiObjectFactoryBean;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

import com.kcp.bo.UserBO;


@Configuration
@ComponentScan(basePackages = "com.kcp.dao")
@PropertySources({ @PropertySource("classpath:/com/kcp/commons/hibernate.properties"),
		@PropertySource("classpath:/com/kcp/commons/jndi.properties") })
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
	// LocalSessionFactoryBean class gives SessionFactory object because FactoryBean Gives Resultant object
	@Bean
	public LocalSessionFactoryBean getLFactoryBean() {
		LocalSessionFactoryBean factoryBean = null;
		Properties pro = null;
		factoryBean = new LocalSessionFactoryBean();
		factoryBean.setDataSource((DataSource) getJOFB().getObject());
		factoryBean.setAnnotatedClasses(UserBO.class);
		factoryBean.setAnnotatedPackages("com.kcp.bo");
		pro = new Properties();
		pro.setProperty(env.getProperty("dialect.key"), env.getProperty("dialect.value"));
		pro.setProperty(env.getProperty("showSQL.key"), env.getProperty("showSQL.value"));
		factoryBean.setHibernateProperties(pro);
		System.out.println(factoryBean.getClass().getName());
		return factoryBean;

	}

	@Bean
	public HibernateTemplate getTemplate() {
		return new HibernateTemplate(getLFactoryBean().getObject());
	}
}
