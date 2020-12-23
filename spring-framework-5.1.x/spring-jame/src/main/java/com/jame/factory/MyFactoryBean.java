package com.jame.factory;

import com.jame.pojo.A;
import com.jame.pojo.B;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

/**
 * @author: Jame
 * @date: 2020/12/8 14:58
 * @description:
 */

public class MyFactoryBean implements FactoryBean<A> {
	@Override
	public A getObject() throws Exception {
		return new A();
	}

	@Override
	public Class<?> getObjectType() {
		return A.class;
	}

	@Override
	public boolean isSingleton() {
		return false;
	}
}
