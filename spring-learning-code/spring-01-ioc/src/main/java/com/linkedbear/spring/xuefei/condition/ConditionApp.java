package com.linkedbear.spring.xuefei.condition;

import com.linkedbear.spring.xuefei.condition.config.BeanConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @description:
 * @author: xuefei
 * @date: 2023/07/19 18:59
 */
public class ConditionApp {


    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
        try {
            Object obj = context.getBean("beanObj");
            System.out.println("beanObj 存在！");
        } catch (Exception e) {
            System.out.println("beanObj 不存在！");
        }
    }

}
