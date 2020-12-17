package com.jame.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author: sunan
 * @date: 2020/12/4 10:40
 * @description:
 */

public class A {

	private B b;

	public A() {
	}

	public B getB() {
		return b;
	}

	public void setB(B b) {
		this.b = b;
	}


}
