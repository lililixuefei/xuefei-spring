package com.linkedbear.spring.xuefei.batman.qualifier;

import com.linkedbear.spring.xuefei.batman.qualifier.config.WebMvcConfiguration1;
import com.linkedbear.spring.xuefei.batman.qualifier.config.WebMvcConfiguration2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @description:
 * @author: xuefei
 * @date: 2023/07/30 22:14
 */
public class Qualifier1App {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(WebMvcConfiguration1.class);
        WebMvcConfiguration1 bean1 = context.getBean(WebMvcConfiguration1.class);
        // 打印字段的值
        System.out.println(bean1.person);

        System.out.println("------------------------------------");

        WebMvcConfiguration2 bean2 = context.getBean(WebMvcConfiguration2.class);
        // 打印字段的值
        System.out.println(bean2.person);


    }


}
