package com.xuefei.spring.aop;


import com.xuefei.spring.service.MyService;

/**
 * @description:
 * @author: xuefei
 * @date: 2022/04/05 01:20
 */
public class MyAopApplication {
    public static void main(String[] args) {
        MyService myService = new MyService();
        myService.foo();
    }
}
