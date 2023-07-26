package com.linkedbear.spring.xuefei.importannotation.config;

import com.linkedbear.spring.xuefei.importannotation.bean.Element02;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @description:
 * @author: xuefei
 * @date: 2023/07/19 19:19
 */
public class Element02ImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {

    /**
     * 在 registerBeanDefinitions 中注册element02对应的BeanDefinition
     * 也就是把 Element02 对应的 beanDefinition 手动注册到beanFactory
     * 的 beanDefinitionMap 中
     */
    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata,
                                        BeanDefinitionRegistry registry) {
        registry.registerBeanDefinition("element02", new RootBeanDefinition(Element02.class));
    }

}
