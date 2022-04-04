package com.xuefei.spring.aware;

import org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor;
import org.springframework.context.annotation.CommonAnnotationBeanPostProcessor;
import org.springframework.context.support.GenericApplicationContext;

/**
 * @description: Aware 接口、InitializingBean 接口
 * @author: xuefei
 * @date: 2022/04/05 00:21
 */
public class MyApplication {
    public static void main(String[] args) {

        /**
         * 1.Aware 接口用于注入一些与容器相关的信息，例如：
         *     a.BeanNameAware 接口用于注入 bean 的名称
         *     b.BeanFactoryAware 注入BeanFactory 容器
         *     c.ApplicationContextAware 注入 ApplicationContext 容器
         *     d.EmbeddedValueResolverAware 注入 ${} 解析器
         */
        GenericApplicationContext context = new GenericApplicationContext();
        context.registerBean("myBean", MyBean.class);

        // 添加后处理器
        context.registerBean(AutowiredAnnotationBeanPostProcessor.class);
        context.registerBean(CommonAnnotationBeanPostProcessor.class);
        context.refresh();
        context.close();

        /**
         * 问题提出：b、c、d 的功能用 @Autowired 就能实现，为啥还要用 Aware 接口实现呢？
         * 简单的说：
         *     a.@Autowired 的解析需要用到 bean 后处理器，属于扩展功能
         *     b.而Aware接口属于内置功能，不加任何扩展，Spring 就能识别
         * 某些情况下，扩展功能会失效，而内置功能不会失效
         */

    }
}
