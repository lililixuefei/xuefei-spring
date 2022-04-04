package com.xuefei.spring.aware;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.EmbeddedValueResolverAware;
import org.springframework.util.StringValueResolver;

import javax.annotation.PostConstruct;

/**
 * @description:
 * @author: xuefei
 * @date: 2022/04/05 00:17
 */
public class MyBean implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, EmbeddedValueResolverAware, InitializingBean {

    @Override
    public void setBeanName(String name) {
        System.out.println("当前Bean " + this + " 名字叫:" + name);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("当前Bean " + this + " 容器叫:" + applicationContext);
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("当前Bean " + this + " 初始化");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("当前Bean " + this + " beanFactory叫:" + beanFactory);
    }

    @Override
    public void setEmbeddedValueResolver(StringValueResolver resolver) {
        System.out.println("当前Bean " + this + " resolver叫:" + resolver);
    }

    @Autowired
    public void aaa(ApplicationContext applicationContext) {
        System.out.println("当前Bean " + this + "使用 @Autowired 容器叫:" + applicationContext);
    }

    @PostConstruct
    public void init() {
        System.out.println("当前Bean " + this + "使用 @PostConstruct 初始化");
    }
}
