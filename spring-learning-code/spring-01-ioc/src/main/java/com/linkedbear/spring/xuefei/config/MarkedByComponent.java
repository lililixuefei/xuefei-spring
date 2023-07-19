package com.linkedbear.spring.xuefei.config;

import com.linkedbear.spring.xuefei.bean.A;
import com.linkedbear.spring.xuefei.bean.B;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * @description:
 * @author: xuefei
 * @date: 2023/07/18 23:42
 */
@Component
public class MarkedByComponent {

    @Bean
    public A a(){
        return new A();
    }

    @Bean
    public B b(){
        a();
        return new B();
    }

}

