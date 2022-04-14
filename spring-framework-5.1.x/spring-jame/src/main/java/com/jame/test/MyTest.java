package com.jame.test;


import com.jame.config.Myconfig;
import com.jame.config.post_processor.BDRPP_API;
import com.jame.pojo.A;
import com.jame.pojo.test.Test;
import com.jame.pojo.test.TestA;
import com.jame.pojo.test.TestB;
import com.jame.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author: sunan
 * @date: 2020/12/3 10:27
 * @description:
 */

public class MyTest {


	public static void main(String[] args)  {


		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.setBeanNameGenerator();
		context.register(Myconfig.class);
		context.refresh();
		context.getBean("a");
		System.out.println();


		//UserService userService = (UserService) context.getBean("userService");
		//System.out.println(userService.getUserCount());


	}


}


