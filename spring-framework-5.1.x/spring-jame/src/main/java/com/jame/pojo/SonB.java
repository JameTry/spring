package com.jame.pojo;

/**
 * @author: SunAnKang
 * @date: 2020/12/21 10:37
 * @description:
 */
public class SonB {
	int age;

	public SonB(int age) {
		this.age = age;
	}

	public SonB() {
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "SonB{" +
				"age=" + age +
				'}';
	}
}
