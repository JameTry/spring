package com.jame.pojo;

import org.springframework.stereotype.Component;

import javax.xml.ws.ServiceMode;

/**
 * @author: sunan
 * @date: 2020/12/4 10:40
 * @description:
 */

public class A   {

	private  B b;

	public A() {
	}

	public A(B b) {
		this.b = b;
	}

	public B getB() {
		return b;
	}

	public void setB(B b) {
		this.b = b;
	}
}
