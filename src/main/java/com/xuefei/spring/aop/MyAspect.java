package com.xuefei.spring.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * @description:
 * @author: xuefei
 * @date: 2022/04/05 01:16
 */
@Aspect
public class MyAspect {

    @Before("execution(* com.xuefei.spring.service.MyService.foo())")
    public void before(){
        System.out.println("before()");
    }

}
