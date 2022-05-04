package com.jame.pojo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 * @author : Jame
 * @date : 2022-04-09 14:23
 **/
@Component
public class HomeTest {


	@Autowired
	private Home home1;


	public void setHome(Home home) {
		this.home1 = home;
	}

	@Override
	public String toString() {
		return "HomeTest{" +
				"home=" + home1 +"========"+
				'}';
	}
}
