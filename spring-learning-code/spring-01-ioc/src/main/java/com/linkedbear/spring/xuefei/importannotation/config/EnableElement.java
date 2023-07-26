package com.linkedbear.spring.xuefei.importannotation.config;

import com.linkedbear.spring.xuefei.importannotation.bean.Element01;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * @description:
 * @author: xuefei
 * @date: 2023/07/19 19:20
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import({
        // 普通类
        Element01.class,
        // 实现了 ImportBeanDefinitionRegistrar 的类
        Element02ImportBeanDefinitionRegistrar.class,
        // 实现了 ImportSelector 的类
        Element03Selector.class,
        // 被 @Configuration 标记的类
        Element04Configuration.class
})
public @interface EnableElement {

}
