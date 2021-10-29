package com.jame.config;


import com.jame.pojo.B;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
// implements BeanFactoryPostProcessor
public class TestIgnoreDependencyType {
//	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		//设置所有自动注入的属性如果类型为B则忽略
		beanFactory.ignoreDependencyType(B.class);
	}
}
