package com.linkedbear.spring.xuefei.importannotation.config;

import com.linkedbear.spring.xuefei.importannotation.bean.Element04;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @description:
 * @author: xuefei
 * @date: 2023/07/19 19:19
 */
@Configuration
public class Element04Configuration {
    @Bean
    public Element04 element04() {
        return new Element04();
    }

}
