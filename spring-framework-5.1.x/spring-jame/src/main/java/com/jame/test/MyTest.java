package com.jame.test;

import com.jame.config.MyFactoryBean;
import com.jame.config.Myconfig;
import com.jame.pojo.A;
import com.jame.pojo.B;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.io.ClassPathResource;

/**
 * @author: sunan
 * @date: 2020/12/3 10:27
 * @description:
 */
public class MyTest {
	public static void main(String[] args) throws Exception {
		test1();
	}

	public static void test1() throws Exception {
		XmlBeanFactory factory = new XmlBeanFactory(new ClassPathResource("beans.xml"));
		A a = (A) factory.getBean("mf");
		A a1 = (A) factory.getBean("mf");
		System.out.println(a1);


	}


}


