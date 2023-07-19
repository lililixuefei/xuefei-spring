package com.linkedbear.spring.xuefei.bean.config;

import com.linkedbear.spring.xuefei.bean.bean.BeanObj1;
import com.linkedbear.spring.xuefei.bean.bean.BeanObj2;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * @description:
 * @author: xuefei
 * @date: 2023/07/19 17:24
 */
//@Component
@Configuration
public class BeanConfig {



    @Bean
    public BeanObj1 beanObj1() {
        return new BeanObj1();
    }

//    @Bean
//    public BeanObj2 beanObj2() {
//        // 这里调用下 beanObj1() 方法
//        beanObj1();
//        return new BeanObj2();
//    }

}
