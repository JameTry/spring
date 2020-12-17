package com.jame.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author: sunan
 * @date: 2020/12/3 10:27
 * @description:
 */
public class B {

	private A a;

	public B() {
	}



	public A getA() {
		return a;
	}

	public void setA(A a) {
		this.a = a;
	}


}