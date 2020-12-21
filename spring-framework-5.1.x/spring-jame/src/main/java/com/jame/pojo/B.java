package com.jame.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author: sunan
 * @date: 2020/12/3 10:27
 * @description:
 */
public class B {


	String name;

	public B() {
	}

	public B(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "B{" +
				"name='" + name + '\'' +
				'}';
	}
}