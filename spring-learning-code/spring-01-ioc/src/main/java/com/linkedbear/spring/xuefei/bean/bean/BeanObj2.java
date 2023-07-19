package com.linkedbear.spring.xuefei.bean.bean;

import org.springframework.stereotype.Component;

/**
 * @description:
 * @author: xuefei
 * @date: 2023/07/19 16:55
 */
@Component
public class BeanObj2 {

    public BeanObj2() {
        System.out.println("调用beanObj2的构造方法");
    }

    @Override
    public String toString() {
        return "BeanObj2{}";
    }
}