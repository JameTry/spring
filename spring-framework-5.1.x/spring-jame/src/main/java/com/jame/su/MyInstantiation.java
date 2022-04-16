package com.jame.su;

import org.springframework.beans.BeansException;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.PropertyValue;
import org.springframework.beans.PropertyValues;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * @author : Jame
 * @date : 2022-04-14 11:19
 **/
//@Component
public class MyInstantiation implements InstantiationAwareBeanPostProcessor {

	@Override
	public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException {
		System.out.println("实例化前的后处理" + beanClass.getSimpleName()+"==="+beanName);
		if (beanClass.isInstance(User.class))
			return new Apple();
		return null;
	}

	@Override
	public boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException {
		System.out.println("实例化后的后处理" + beanName);
		return true;
	}

	@Override
	public PropertyValues postProcessProperties(PropertyValues pvs, Object bean, String beanName) throws BeansException {
//		System.out.println(beanName+"[[[[[");
//		if (beanName.equals("user")) {
//			MutablePropertyValues values = new MutablePropertyValues();
//			values.add("str",new PropertyValue("str","5678"));
//			return values;
//		}
		return null;
	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("初始化前的后处理" + beanName);
		return null;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("初始化后的后处理" + beanName);
		return null;
	}
}
