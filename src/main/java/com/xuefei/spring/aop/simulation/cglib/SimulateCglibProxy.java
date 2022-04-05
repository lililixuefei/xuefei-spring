package com.xuefei.spring.aop.simulation.cglib;

import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @description:
 * @author: xuefei
 * @date: 2022/04/05 20:03
 */
public class SimulateCglibProxy {
    public static void main(String[] args) {
        Target target = new Target();
        Proxy proxy = new Proxy(new MethodInterceptor() {
            @Override
            public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
                System.out.println("before()");
                return method.invoke(target,args);
            }
        });
        proxy.save();
        proxy.save(1);
        proxy.save(100L);
    }
}
