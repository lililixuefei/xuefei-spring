package com.linkedbear.spring.xuefei.autowire.bean;

import com.linkedbear.spring.xuefei.autowire.service.HelloService;

/**
 * @description:
 * @author: xuefei
 * @date: 2023/07/30 20:59
 */
public class Child {

    // 注意：这里并没有@Autowired注解的
    private HelloService helloService;

    private String name;
    private Integer age;

    public HelloService getHelloService() {
        return helloService;
    }

    public void setHelloService(HelloService helloService) {
        this.helloService = helloService;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
