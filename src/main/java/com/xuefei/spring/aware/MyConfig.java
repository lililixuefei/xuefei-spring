package com.xuefei.spring.aware;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.context.annotation.Bean;

import javax.annotation.PostConstruct;

/**
 * @description:
 * @author: xuefei
 * @date: 2022/04/05 00:54
 */
public class MyConfig {

    @Autowired
    public void setApplicationContext(ApplicationContext applicationContext) {
        System.out.println("注入 ApplicationContext");
    }

    @PostConstruct
    public void init() {
        System.out.println("初始化");
    }

    /**
     * 注释或添加 beanFactory 后处理器对应上方两种情况
     *
     * @return
     */
    @Bean
    public BeanFactoryPostProcessor processor() {
        return beanFactory -> {
            System.out.println("执行 processor");
        };
    }
}
