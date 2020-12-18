package com.jame.test;

import com.jame.config.MyFactoryBean;
import com.jame.config.Myconfig;
import com.jame.pojo.A;
import com.jame.pojo.B;
import com.jame.pojo.C;
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
		A a = (A) factory.getBean("a");
		B b = (B) factory.getBean("b");
		System.out.println("a     "+a);
		System.out.println("a-b   "+a.getB());
		System.out.println("a-b-a "+a.getB().getA());

		System.out.println("b     "+b);
		System.out.println("b-a   "+b.getA());
		System.out.println("b-a-b "+b.getA().getB());

		System.out.println((C)factory.getBean("c"));

	}


}


