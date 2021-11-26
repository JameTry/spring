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

public class Myconfig {



}
