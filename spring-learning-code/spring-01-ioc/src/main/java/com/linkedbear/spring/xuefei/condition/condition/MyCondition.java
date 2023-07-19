package com.linkedbear.spring.xuefei.condition.condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

import java.util.Map;

/**
 * @description:
 * @author: xuefei
 * @date: 2023/07/19 18:57
 */
public class MyCondition implements Condition {

    /**
     * 这里处理匹配条件，注意与示例1中的区别
     */
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        // 获取 @ConditionalForClass 注解的所有属性值
        Map<String, Object> annotationAttributes = metadata.getAnnotationAttributes(ConditionalForClass.class.getName());

        // 获取className的属性值，就是 @ConditionalForClass 的 className 属性
        String className = (String) annotationAttributes.get("className");
        if (null == className || className.length() <= 0) {
            return true;
        }
        try {
            // 判断类是否存在
            Class.forName(className);
            return true;
        } catch (ClassNotFoundException e) {
            return false;
        }
    }

//    @Override
//    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
//        String className = "java.lang.Object";
//        try {
//            // 判断类是否存在
//            Class.forName(className);
//            return true;
//        } catch (ClassNotFoundException e) {
//            return false;
//        }
//    }

}

