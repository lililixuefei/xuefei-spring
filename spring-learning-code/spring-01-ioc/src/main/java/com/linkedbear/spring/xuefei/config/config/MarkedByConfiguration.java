package com.linkedbear.spring.xuefei.config.config;

import com.linkedbear.spring.xuefei.config.bean.A;
import com.linkedbear.spring.xuefei.config.bean.B;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @description:
 * @author: xuefei
 * @date: 2023/07/18 23:42
 */
@Configuration()
public class MarkedByConfiguration {


    @Bean
    public B b(){
        a();
        B b = new B();
        System.out.println(b);
        return b;
    }

    @Bean
    public A a(){
        A a = new A();
        System.out.println(a);
        return a;
    }
}

