package com.linkedbear.spring.xuefei.bean.bean;

import org.springframework.stereotype.Component;

/**
 * @description:
 * @author: xuefei
 * @date: 2023/07/19 16:55
 */
@Component
public class BeanObj1 {

    public BeanObj1() {
        System.out.println("调用beanObj1的构造方法");
    }

    @Override
    public String toString() {
        return "BeanObj1{}";
    }
}