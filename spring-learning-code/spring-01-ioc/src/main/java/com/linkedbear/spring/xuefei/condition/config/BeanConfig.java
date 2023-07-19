package com.linkedbear.spring.xuefei.condition.config;

import com.linkedbear.spring.xuefei.condition.bean.BeanObj;
import com.linkedbear.spring.xuefei.condition.condition.ConditionalForClass;
import com.linkedbear.spring.xuefei.condition.condition.MyCondition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Conditional;

/**
 * @description:
 * @author: xuefei
 * @date: 2023/07/19 18:58
 */
@ComponentScan("com.linkedbear.spring.xuefei.condition")
public class BeanConfig {

    @Bean
//    @Conditional(MyCondition.class)
    @ConditionalForClass(className = "java.lang.Object")
    public BeanObj beanObj() {
        return new BeanObj();
    }

}
