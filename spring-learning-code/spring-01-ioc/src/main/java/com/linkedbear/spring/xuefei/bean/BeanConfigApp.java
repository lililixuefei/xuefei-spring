package com.linkedbear.spring.xuefei.bean;

import com.linkedbear.spring.xuefei.bean.config.BeanConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @description: https://my.oschina.net/funcy/blog/4492878
 * @author: xuefei
 * @date: 2023/07/19 17:25
 */
public class BeanConfigApp {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);

        Object obj1 = context.getBean("beanObj1");
        Object obj2 = context.getBean("beanObj2");
        System.out.println("obj1:" + obj1);
        System.out.println("obj2:" + obj2);
        System.out.println(context.getBean("beanConfig"));
    }

}
