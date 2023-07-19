package com.linkedbear.spring.lifecycle.a_initmethod.config;

import com.linkedbear.spring.lifecycle.a_initmethod.bean.Dog;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

//@Component
@Order(109)
public class InitMethodConfiguration {
    
    @Bean(initMethod = "init", destroyMethod = "destroy")
    public Dog dog() {
        Dog dog = new Dog();
        dog.setName("wangwang");
        return dog;
    }
    
}
