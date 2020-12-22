package com.jame.pojo;

/**
 * @author: SunAnKang
 * @date: 2020/12/21 10:37
 * @description:
 */
public class SonB {
	int age;
	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
				", name='" + name + '\'' +
				'}';
	}
}
