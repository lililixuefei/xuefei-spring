package com.linkedbear.spring.xuefei.componentScan;

import com.linkedbear.spring.xuefei.componentScan.config.ComponentConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @description: https://my.oschina.net/funcy/blog/4836178
 * @author: xuefei
 * @date: 2023/07/19 16:55
 */
public class ComponentScanApp {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ComponentConfig.class);
        Object obj1 = context.getBean("beanObj1");
        Object obj2 = context.getBean("beanObj2");
        System.out.println("obj1:" + obj1);
        System.out.println("obj2:" + obj2);
        System.out.println(context.getBean("componentConfig"));
    }

}
