package com.xuefei.spring.aop.proxy;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;

/**
 * @description: Cglib 动态代理
 * @author: xuefei
 * @date: 2022/04/05 01:44
 */
public class CglibDynamicProxyDemo {

    static class Target {
        public void foo() {
            System.out.println("target foo");
        }
    }

    public static void main(String[] param) {
        // 目标对象
        Target target = new Target();
        // 代理对象,代理是子类型、目标是父类型
        Target proxy = (Target) Enhancer.create(Target.class,
                (MethodInterceptor) (p, method, args, methodProxy) -> {
                    System.out.println("proxy before...");
                    Object result = methodProxy.invoke(target, args);
                    // methodProxy 内部没有用反射
//            Object result = methodProxy.invoke(target, args);
                    // 另一种调用方法，不需要目标对象实例
//            Object result = methodProxy.invokeSuper(p, args);
                    System.out.println("proxy after...");
                    return result;
                });
        // 调用代理
        proxy.foo();
    }
}
