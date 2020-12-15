package com.jame.test;

import com.jame.pojo.A;
import org.springframework.beans.factory.xml.XmlBeanFactory;
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
		A a = (A) factory.getBean("a");
		String[] beanDefinitionNames = factory.getBeanDefinitionNames();
		for (String beanDefinitionName : beanDefinitionNames) {

			System.out.println(beanDefinitionName);
		}


	}

}
