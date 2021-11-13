package com.jame.test;


import com.jame.config.Myconfig;
import com.jame.pojo.A;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author: sunan
 * @date: 2020/12/3 10:27
 * @description:
 */

public class MyTest {


	public static void main(String[] args)  {


		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(Myconfig.class, A.class);
		context.refresh();

		context.getBean(A.class);




//		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
//		context.register(Myconfig.class);
//		context.addBeanFactoryPostProcessor(new MyBeanFactoryPostProcessor());
//		context.addBeanFactoryPostProcessor(new MyBeanDefinitionRegistryPostProcessor());
//		context.refresh();


//
//		B bean = gggggg.eeBean(B.class);
//		System.out.println(bean);
//		System.out.println(bean.eeA());
////
//		B bean1= context.getBean(B.class);
//		System.out.println(bean1);
//		System.out.println(bean1.getA());


//		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:beans.xml");
//		Object carFactory = context.getBean("&myFactoryBean");
//		System.out.println(carFactory.getClass().getName());
////		A a = (A) carFactory;
//		System.out.println(a);
	}


}


