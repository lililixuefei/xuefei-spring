package com.linkedbear.spring.basic_di.j_resource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @description:
 * @author: xuefei
 * @date: 2023/07/09 23:17
 */
public class TestResource {

    public static void main(String[] args) throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(ResourceConfig.class);
    }
}
