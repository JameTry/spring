package com.jame.config.post_processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.core.PriorityOrdered;
import org.springframework.stereotype.Component;

/**
 * @author : Jame
 * @date : 2021-10-31 11:06
 **/
@Component
public class BDPPPriorityOrdered1 implements PriorityOrdered, BeanFactoryPostProcessor {
	@Override
	public int getOrder() {
		return 1;
	}

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		System.out.println("实现PriorityOrdered的BDPP,排序1");
	}
}
