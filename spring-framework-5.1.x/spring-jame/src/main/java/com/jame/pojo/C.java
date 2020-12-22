package com.jame.pojo;

import org.springframework.stereotype.Component;

/**
 * @author: SunAnKang
 * @date: 2020/12/7 16:27
 * @description:
 */

public class C {
	int id;


	public C() {
	}



	public C(int id) {
		this.id = id;
	}



	@Override
	public String toString() {
		return "C{" +
				"id=" + id +
				'}';
	}
}
