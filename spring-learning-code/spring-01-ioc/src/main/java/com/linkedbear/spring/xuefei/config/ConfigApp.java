package com.linkedbear.spring.xuefei.config;

import com.linkedbear.spring.xuefei.config.config.MarkedByConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @link https://my.oschina.net/funcy/blog/4492878
 * @description:
 * @author: xuefei
 * @date: 2023/07/18 23:43
 */
public class ConfigApp {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.scan("com.linkedbear.spring.xuefei.config");
        context.refresh();

//        MarkedByComponent component = context.getBean(MarkedByComponent.class);
//
//        System.out.println("-----------------------");
//
//        System.out.println(component.a());
//        System.out.println(component.a());
//        System.out.println(component.b());
//        System.out.println(component.b());

        System.out.println("-----------------------");

        MarkedByConfiguration configuration = context.getBean(MarkedByConfiguration.class);

        System.out.println(configuration.a());
        System.out.println(configuration.a());
        System.out.println(configuration.b());
        System.out.println(configuration.b());
    }
}
