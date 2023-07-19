package com.linkedbear.spring.xuefei.condition.bean;


/**
 * @description:
 * @author: xuefei
 * @date: 2023/07/19 16:55
 */
public class BeanObj {

    public BeanObj() {
        System.out.println("调用beanObj1的构造方法");
    }

    @Override
    public String toString() {
        return "BeanObj1{}";
    }
}