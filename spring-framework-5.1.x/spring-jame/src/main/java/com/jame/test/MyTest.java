package com.jame.test;


import com.jame.config.*;

import com.jame.pojo.A;
import com.jame.pojo.B;
import org.springframework.beans.factory.support.*;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.io.ClassPathResource;

import java.util.HashMap;

/**
 * @author: sunan
 * @date: 2020/12/3 10:27
 * @description:
 */

public class MyTest {


	public static void main(String[] args) throws Exception {
		test2();
	}

	public static void test1() throws Exception {
		XmlBeanFactory factory = new XmlBeanFactory(new ClassPathResource("beans.xml"));
		Object b = factory.getBean("gb");
		System.out.println(b);
	}

	public static void test2() throws Exception {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(A.class, B.class,MyTest.class);

		context.refresh();
		System.out.println(context.getBean(A.class)==context.getBean(A.class));

	}


}


