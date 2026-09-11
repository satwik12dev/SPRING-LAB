package com.naresh.bfpp;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

public class CustomBFPP implements BeanFactoryPostProcessor {

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory)
            throws BeansException {

        BeanDefinition beanDefinition =
                beanFactory.getBeanDefinition("users");

        beanDefinition.getPropertyValues()
                .add("name", "Modified By bean");

        beanDefinition.getPropertyValues()
                .add("age", 25);
    }
}