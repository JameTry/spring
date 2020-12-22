package com.jame.test;

import com.jame.config.MyFactoryBean;
import com.jame.config.Myconfig;
import com.jame.pojo.A;
import com.jame.pojo.B;
import com.jame.pojo.C;
import com.jame.pojo.SonB;
import org.springframework.beans.factory.support.ChildBeanDefinition;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
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
		C c = (C) factory.getBean("c",2);
		System.out.println(c);
		String[] strings = factory.getBeanDefinitionNames();
		for (String string : strings) {
			System.out.println(string);
		}

	}


}


