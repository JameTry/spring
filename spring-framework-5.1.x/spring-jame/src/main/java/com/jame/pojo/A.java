package com.jame.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author: sunan
 * @date: 2020/12/4 10:40
 * @description:
 */
@Component
public class A {

	//@Autowired
	private B b;

	public A() {
	//	System.out.println("a");
	}

	public B getB() {
		return b;
	}

	@Override
	public String toString() {
		return "A{" +
				"b=" + b +
				'}';
	}
}
