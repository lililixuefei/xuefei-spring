package com.linkedbear.spring.basic_di.j_resource;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import javax.annotation.Resource;

/**
 * @description:
 * @author: xuefei
 * @date: 2023/07/09 23:18
 */
@Configuration
@ComponentScan("com.linkedbear.spring.basic_di.j_resource")
public class ResourceConfig {

    @Resource
    private Dog dog;


}
