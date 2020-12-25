package com.jame.test_pojo;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * @author: SunAnKang
 * @date: 2020/12/24 上午 10:00
 * @description:
 */
@Component("tA")
public class A extends B {
	static int i=0;
	static {
		System.out.println("A的静态代码块");
	}

	{
		System.out.println("A的非静态代码块");
	}

	public A() {
		i++;
		System.out.println("A的构造方法");
	}

	public static int getI() {
		return i;
	}

	@PostConstruct
	public void postProcess() {
		System.out.println("A的Bean生命周期初始化回调方法");
	}
}
