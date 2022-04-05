package com.xuefei.spring.aop.simulation.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @description:
 * @author: xuefei
 * @date: 2022/04/05 01:59
 */
public class SimulateJdkProxy {
    interface Foo {
        void foo();

        int bar();
    }

//    interface InvocationHandler {
//        Object invoke(Object proxy, Method method, Object[] args) throws Throwable;
//    }

    static class Target implements Foo {
        @Override
        public void foo() {
            System.out.println("target foo");
        }

        @Override
        public int bar() {
            System.out.println("target bar");
            return 100;
        }
    }

    public static void main(String[] param) {
        // 1. 创建代理，这时传入 InvocationHandler
        Foo proxy = new $Proxy0(new InvocationHandler() {
            // ️5. 进入 InvocationHandler
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                // ️6. 功能增强
                System.out.println("before...");
                // 7. 反射调用目标方法
                return method.invoke(new Target(), args);
            }
        });
        // 2. 调用代理方法
        proxy.foo();
        proxy.bar();
    }
}
