package com.jame.config;

import com.jame.pojo.A;
import com.jame.pojo.B;
import com.jame.pojo.C;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;

/**
 * @author: Jame
 * @date: 2020/12/3 10:27
 * @description:
 */



@Configuration
@ComponentScan("com.jame")
@MapperScan("com.jame.mapper")
public class Myconfig {

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
