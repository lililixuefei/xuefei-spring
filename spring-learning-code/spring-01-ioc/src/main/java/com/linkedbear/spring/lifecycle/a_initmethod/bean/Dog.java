package com.linkedbear.spring.lifecycle.a_initmethod.bean;

public class Dog {
    
    private String name;
    
    public void setName(String name) {
        System.out.println("Dog - setName 执行了");
        this.name = name;
    }

    public Dog() {
        System.out.println("Dog - 构造器 执行了");
    }

    protected void init() {
        System.out.println(name + "被初始化了。。。");
    }

    protected void destroy() {
        System.out.println(name + "被销毁了。。。");
    }
}
