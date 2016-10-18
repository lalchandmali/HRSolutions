package org.hrSolution.configuration;

import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@ComponentScan({ "org.hrSolution.configuration" })
@PropertySource(value = { "classpath:database.properties" })
public class HibernateConfiguration {

	private static final Logger logger = LoggerFactory
			.getLogger(HibernateConfiguration.class);

	/**
	 * Interface representing the environment in which the current application
	 * is running. Models two key aspects of the application environment:
	 * profiles and properties. Methods related to property access are exposed
	 * */
	@Autowired
	private Environment environment;

	@Bean
	public LocalSessionFactoryBean sessionFactory() {
		/**
		 * its core purpose is to bootstrap a SessionFactory from package
		 * scanning.
		 * */
		LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
		sessionFactory.setDataSource(dataSource());
		sessionFactory.setPackagesToScan(new String[] { "org.hrSolution" });
		sessionFactory.setHibernateProperties(hibernateProperties());

		logger.debug("Hibernate and database Properties Loaded Successfully");

		return sessionFactory;
	}

	@Bean
	public DataSource dataSource() {
		/**
		 * Loading database property from database.properties file in resource
		 * folder
		 * */
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName(environment
				.getRequiredProperty("jdbc.driverClassName"));
		dataSource.setUrl(environment.getRequiredProperty("jdbc.url"));
		dataSource
				.setUsername(environment.getRequiredProperty("jdbc.username"));
		dataSource
				.setPassword(environment.getRequiredProperty("jdbc.password"));

		logger.debug("Database Properties loaded successfully");
		return dataSource;
	}

	private Properties hibernateProperties() {
		/**
		 * Loading hibernate property from database.properties file in resource
		 * folder
		 * */
		Properties properties = new Properties();
		properties.put("hibernate.dialect",
				environment.getRequiredProperty("hibernate.dialect"));
		properties.put("hibernate.show_sql",
				environment.getRequiredProperty("hibernate.show_sql"));
		properties.put("hibernate.format_sql",
				environment.getRequiredProperty("hibernate.format_sql"));
		properties.put("hibernate.hbm2ddl.auto",
				environment.getRequiredProperty("hibernate.hbm2ddl.auto"));

		System.out.println(environment
				.getRequiredProperty("hibernate.hbm2ddl.auto"));

		logger.debug("Hibernate Properties loaded successfully");
		return properties;
	}

	@Bean
	@Autowired
	public HibernateTransactionManager transactionManager(SessionFactory s) {
		/**
		 * This transaction manager is appropriate for applications that use a
		 * single Hibernate SessionFactory for transactional data access, but it
		 * also supports direct DataSource access within a transaction (i.e.
		 * plain JDBC code working with the same DataSource)
		 * */
		HibernateTransactionManager txManager = new HibernateTransactionManager();
		txManager.setSessionFactory(s);
		return txManager;
	}

}
