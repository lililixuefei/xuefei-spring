package com.linkedbear.spring.xuefei.batman.qualifier.bean;

/**
 * @description:
 * @author: xuefei
 * @date: 2023/07/30 22:14
 */
public class Person {

    private String name;

    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
