package com.linkedbear.spring.lifecycle.a_initmethod;

import com.linkedbear.spring.lifecycle.a_initmethod.config.InitMethodConfiguration;
import com.linkedbear.spring.lifecycle.a_initmethod.processor.TestBeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class InitMethodAnnoApplication {
    
    public static void main(String[] args) throws Exception {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();

        ctx.register(InitMethodConfiguration.class);
        ctx.addBeanFactoryPostProcessor(new TestBeanFactoryPostProcessor());

        ctx.refresh();

        System.out.println("IOC容器初始化完成。。。");
        Thread.sleep(3000);
        ctx.close();
    }
}
