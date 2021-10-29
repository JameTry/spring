package com.jame.test;


import com.jame.config.*;
import com.jame.pojo.A;
import com.jame.pojo.B;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: sunan
 * @date: 2020/12/3 10:27
 * @description:
 */

public class MyTest {


	public static void main(String[] args) throws Exception {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Myconfig.class);

		context.getBean(A.class);
		B bean = context.getBean(B.class);
		System.out.println(bean);
		System.out.println(bean.getA());

		B bean1= context.getBean(B.class);
		System.out.println(bean1);
		System.out.println(bean1.getA());


//		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:beans.xml");
//		Object carFactory = context.getBean("&myFactoryBean");
//		System.out.println(carFactory.getClass().getName());
////		A a = (A) carFactory;
//		System.out.println(a);
	}


}


