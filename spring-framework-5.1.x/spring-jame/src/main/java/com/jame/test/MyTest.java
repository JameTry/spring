package com.jame.test;


import com.jame.config.*;

import com.jame.config.post_processor.MyBeanFactoryPostProcessor;
import com.jame.pojo.A;
import com.jame.pojo.B;
import org.springframework.beans.factory.support.*;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.core.io.ClassPathResource;

import java.util.HashMap;

/**
 * @author: sunan
 * @date: 2020/12/3 10:27
 * @description:
 */

@ComponentScan("com.jame.pojo")
public class MyTest {


	public static void main(String[] args) throws Exception {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Myconfig.class);

		B bean = context.getBean(B.class);
		System.out.println(bean);


	}




}


