package com.jame.pojo;

import com.jame.pojo.test.Test;
import com.jame.pojo.test.TestA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;


/**
 * @author: sunan
 * @date: 2020/12/4 10:40
 * @description:
 */
@Component
public class A   {

	private TestA testA;

	public void setTestA(TestA testA) {
		System.out.println("走set方法啦");
		this.testA = testA;
	}

	@Override
	public String toString() {
		return "A{" +
				"testA=" + testA +
				'}';
	}
}
