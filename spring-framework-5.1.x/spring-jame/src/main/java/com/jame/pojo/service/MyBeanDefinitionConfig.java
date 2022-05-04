package com.jame.pojo.service;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.AnnotatedBeanDefinition;
import org.springframework.beans.factory.annotation.AnnotatedGenericBeanDefinition;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ScannedGenericBeanDefinition;
import org.springframework.stereotype.Component;

/**
 * @author : Jame
 * @date : 2022-04-09 14:24
 **/
@Component
public class MyBeanDefinitionConfig implements BeanDefinitionRegistryPostProcessor {

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		ScannedGenericBeanDefinition homeTest = (ScannedGenericBeanDefinition) beanFactory.getBeanDefinition("homeTest");
		homeTest.setAutowireMode(2);
		beanFactory.ignoreDependencyType(Home.class);
	}

	@Override
	public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
//		ScannedGenericBeanDefinition homeTest =(ScannedGenericBeanDefinition) registry.getBeanDefinition("homeTest");
//		homeTest.setAutowireMode(2);

	}
}
