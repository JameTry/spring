package com.jame.pojo;

import com.jame.pojo.test.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;


/**
 * @author: sunan
 * @date: 2020/12/4 10:40
 * @description:
 */
@Component
public class A   {
	public A() {
		System.out.println("a created");
	}


	//	@Autowired
//	private ApplicationContext applicationContext;
//
//	@Autowired
//	private Test testA;


//	public void setTest(Test test) {
//		this.testA = test;
//	}
//
//	@Override
//	public String toString() {
//		return "A{" +
//				"test=" + testA +
//				"sdasd"+applicationContext+
//				'}';
//	}
}
