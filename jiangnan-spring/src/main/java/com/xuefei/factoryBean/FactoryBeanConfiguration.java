package com.xuefei.factoryBean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @description:
 * @author: xuefei
 * @date: 2023/10/12 18:46
 */
@Configuration
public class FactoryBeanConfiguration {


    @Bean
    public Author author() {
        return Author.init("ll", 18);
    }

//    @Bean
//    public Author author() {
//        return new Author("ll", 18);
//    }


}
