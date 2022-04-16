package com.jame.su;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author : Jame
 * @date : 2022-04-14 08:30
 **/
@Component
public class User {

	//@Autowired
	private Apple apple;
	private String str;

	public Apple getApple() {
		return apple;
	}

	public void setApple(Apple apple) {
		this.apple = apple;
	}

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}
}
