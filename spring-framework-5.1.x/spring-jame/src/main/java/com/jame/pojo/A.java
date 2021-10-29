package com.jame.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * @author: sunan
 * @date: 2020/12/4 10:40
 * @description:
 */
@Component
public class A {
	private String name;
	public A() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "A{" +
				"name='" + name + '\'' +
				'}';
	}
//	@PostConstruct
//	public void init(){
//		System.out.println("执行初始化回调方法");
//	}


}
