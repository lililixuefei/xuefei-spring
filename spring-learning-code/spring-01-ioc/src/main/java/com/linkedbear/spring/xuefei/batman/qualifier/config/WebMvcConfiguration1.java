package com.linkedbear.spring.xuefei.batman.qualifier.config;

import com.linkedbear.spring.xuefei.batman.qualifier.bean.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @description:
 * @author: xuefei
 * @date: 2023/07/30 22:14
 */
@Configuration
public class WebMvcConfiguration1 {

    @Qualifier("person1")
    @Autowired
    public Person person;

    @Bean
    public Person person1() {
        return new Person("fsx01", 16);
    }
    @Bean
    public Person person2() {
        return new Person("fsx02", 18);
    }
}

