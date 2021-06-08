package com.jame.config.post_processor;

import org.springframework.beans.BeansException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.config.BeanPostProcessor;


/**
 * @author : Jame
 * @date : 2021-06-08 10:05
 **/
@Component
public class MyBeanPostProcessor implements BeanPostProcessor {

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		return null;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		return null;
	}
}
