package com.linkedbear.spring.xuefei;

import com.linkedbear.spring.xuefei.config.MarkedByComponent;
import com.linkedbear.spring.xuefei.config.MarkedByConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @description:
 * @author: xuefei
 * @date: 2023/07/18 23:43
 */
public class ConfigApp {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.scan("com.linkedbear.spring.xuefei.config");
        context.refresh();

        MarkedByComponent component = context.getBean(MarkedByComponent.class);

        System.out.println(component.a());
        System.out.println(component.a());
        System.out.println(component.b());
        System.out.println(component.b());

        System.out.println("-----------------------");

        MarkedByConfiguration configuration = context.getBean(MarkedByConfiguration.class);

        System.out.println(configuration.a());
        System.out.println(configuration.a());
        System.out.println(configuration.b());
        System.out.println(configuration.b());
    }
}
