package com.linkedbear.spring.basic_di.j_resource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component("dog")
public class Dog {

    @Value("dogdog")
    private String name;

}
