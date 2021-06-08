package com.jame.config.post_processor;

import com.jame.pojo.B;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.stereotype.Component;

/**
 * @author: SunAnKang
 * @date: 2020/12/23 上午 10:24
 * @description:
 */

public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		AbstractBeanDefinition a= (AbstractBeanDefinition) beanFactory.getBeanDefinition("a");//a.setBeanClass(B.class);
		a.setAutowireMode(AbstractBeanDefinition.AUTOWIRE_BY_TYPE);
		//beanFactory.ignoreDependencyType(B.class);
	}
}
