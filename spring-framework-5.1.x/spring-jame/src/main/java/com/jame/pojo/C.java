package com.jame.pojo;

import org.springframework.stereotype.Component;

/**
 * @author: SunAnKang
 * @date: 2020/12/7 16:27
 * @description:
 */

public class C {

	private A a;

	public C() {
	}

	public C(A a) {
		this.a = a;
	}

	public A getA() {
		return a;
	}

	public void setA(A a) {
		this.a = a;
	}

	@Override
	public String toString() {
		return "C{" +
				"a=" + a +
				'}';
	}
}
