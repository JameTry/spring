package com.jame.config;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

/**
 * @author : Jame
 * @date : 2021-11-21 14:44
 **/
//@Configuration
//@MapperScan("com.jame.mapper")
public class MyBatisSpringConfig {

	@Bean
	public DataSource dataSource(){
		DriverManagerDataSource source = new DriverManagerDataSource();
		source.setDriverClassName("com.mysql.cj.jdbc.Driver");
		source.setUsername("root");
		source.setPassword("root");
		source.setUrl("jdbc:mysql://localhost:3306/study?useSSL=true&useUnicode=true&characterEncoding=utf8");
		return source;
	}

	@Bean
	public SqlSessionFactoryBean sqlSessionFactory(DataSource dataSource){
		SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
		factoryBean.setDataSource(dataSource);
		return factoryBean;
	}

}
