package com.kcp.config;


import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
public class AOPConfig {
	@Autowired
	private SessionFactory factory;
	

	@Bean(name = "hbTxMgr")
	public HibernateTransactionManager getTxMGR() {
		return new HibernateTransactionManager(factory);
	}
}
