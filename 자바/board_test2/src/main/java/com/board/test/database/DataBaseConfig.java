package com.board.test.database;

import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

@Configuration
@EnableJpaRepositories(
		basePackages="com.board.test.repo", // repository를 관리할 패키지 명시
		entityManagerFactoryRef = "entityManagerFactory", //EntityManagerFactory
		transactionManagerRef = "transactionManager" // transactionManager
		)
public class DataBaseConfig {
	private static final String DEFAULT_NAMING_STRATEGY
	= "org.springframework.boot.orm.jpa.hibernate.SpringPhysicalNamingStrategy";

	@Bean
	@Primary // 해당 Bean을 우선적으로 선택하도록 하는 annotation
	public DataSource defaultDataSource() {
		HikariConfig dataSourceConfig = new HikariConfig();
		dataSourceConfig.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dataSourceConfig.setJdbcUrl("jdbc:mysql://project-db-stu.ddns.net:3307/seeu");
		dataSourceConfig.setUsername("seeu");
		dataSourceConfig.setPassword("12345");
		dataSourceConfig.setMaximumPoolSize(10);
		dataSourceConfig.setMinimumIdle(5);
		dataSourceConfig.setMaxLifetime(1200000);
		dataSourceConfig.setConnectionTimeout(20000);
		dataSourceConfig.setIdleTimeout(300000);
		
		return new HikariDataSource(dataSourceConfig);
	}
	
	@Bean(name = "entityManagerFactory")
	@Primary
	public LocalContainerEntityManagerFactoryBean entityManagerFactory(
			EntityManagerFactoryBuilder builder) {
		
		Map<String, String> propertiesHashMap = new HashMap<>();
		propertiesHashMap.put("hibernate.physical_naming_strategy", DEFAULT_NAMING_STRATEGY);
		
		LocalContainerEntityManagerFactoryBean req = 
		builder.dataSource(defaultDataSource())
		.packages("com.board.test.domain")
		// domain을 관리할 패키지 경로 명시 (domain = DO 파일)
		.properties(propertiesHashMap)
		.build();
		
		return req;
	}
	
	//트랜젝션 관리
	@Primary
	@Bean(name = "transactionManager")
	PlatformTransactionManager transactionManager(
		EntityManagerFactoryBuilder builder) {
		return new JpaTransactionManager(entityManagerFactory(builder).getObject());
	}
	
	
	
}
	