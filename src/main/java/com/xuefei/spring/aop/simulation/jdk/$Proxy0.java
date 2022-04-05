package com.xuefei.spring.aop.simulation.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.lang.reflect.UndeclaredThrowableException;

/**
 * @description:
 * @author: xuefei
 * @date: 2022/04/05 01:59
 */
public class $Proxy0 extends Proxy implements SimulateJdkProxy.Foo {

    public $Proxy0(InvocationHandler h) {
        super(h);
    }

    // ️3. 进入代理方法
    @Override
    public void foo() {
        try {
            // 4. 回调 InvocationHandler
            h.invoke(this, foo, new Object[0]);
        } catch (RuntimeException | Error e) {
            throw e;
        } catch (Throwable e) {
            throw new UndeclaredThrowableException(e);
        }
    }

    @Override
    public int bar() {
        try {
            Object result = h.invoke(this, bar, new Object[0]);
            return (int) result;
        } catch (RuntimeException | Error e) {
            throw e;
        } catch (Throwable e) {
            throw new UndeclaredThrowableException(e);
        }
    }

    static Method foo;
    static Method bar;

    static {
        try {
            foo = SimulateJdkProxy.Foo.class.getMethod("foo");
            bar = SimulateJdkProxy.Foo.class.getMethod("bar");
        } catch (NoSuchMethodException e) {
            throw new NoSuchMethodError(e.getMessage());
        }
    }
}
