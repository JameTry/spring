package com.jame.test_pojo;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * @author: SunAnKang
 * @date: 2020/12/24 上午 10:07
 * @description:
 */
@Component("tB")
public class B {

	static int i = 0;

	static {
		System.out.println("B的静态代码块");
	}

	{
		System.out.println("B的非静态代码块");
	}

	public B() {
		i++;
		System.out.println("B的构造方法");
	}

	public static int getI() {
		return i;
	}

	@PostConstruct
	public void postProcess() {
		System.out.println("B的Bean生命周期初始化回调方法");
	}
}
