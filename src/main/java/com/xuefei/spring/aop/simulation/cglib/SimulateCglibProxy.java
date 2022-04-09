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
//                return method.invoke(target, args);   // 反射调用
//                return methodProxy.invoke(target, args);  // 内部无反射，结合目标使用
                return methodProxy.invokeSuper(o, args);  // 内部无反射，结合代理使用
            }
        });
        proxy.save();
        proxy.save(1);
        proxy.save(100L);
    }
}
