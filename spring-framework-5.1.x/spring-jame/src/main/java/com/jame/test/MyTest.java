package com.jame.test;


import com.jame.config.MyConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author: sunan
 * @date: 2020/12/3 10:27
 * @description:
 */

public class MyTest {


	public static void main(String[] args)  {


		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.setBeanNameGenerator(null);
		context.register(MyConfig.class);
		context.refresh();
		context.getBean("a");
		System.out.println();


		//UserService userService = (UserService) context.getBean("userService");
		//System.out.println(userService.getUserCount());


	}


}


