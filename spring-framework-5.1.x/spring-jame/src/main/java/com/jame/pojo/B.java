package com.jame.pojo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author: sunan
 * @date: 2020/12/3 10:27
 * @description:
 */
@Component
@Scope("prototype")
public class B  {

	@Autowired
	private A a;

	public A getA() {
		return a;
	}

	public void setA(A a) {
		this.a = a;
	}

	int age;

	String name;

	public B() {
		System.out.println("B初始化完成");
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


}