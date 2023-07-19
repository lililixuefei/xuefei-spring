package com.linkedbear.spring.xuefei.condition.condition;

import org.springframework.context.annotation.Conditional;

import java.lang.annotation.*;

/**
 * @description:
 * @author: xuefei
 * @date: 2023/07/19 19:03
 */
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
// 组合了 @Conditional 的功能，处理条件匹配的类为 MyCondition
@Conditional(MyCondition.class)
public @interface ConditionalForClass {

    /**
     * 这里指定必须存在的类
     */
    String className();

}
