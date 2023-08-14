package com.linkedbear.spring.xuefei.batman.qualifier;

import com.linkedbear.spring.xuefei.batman.qualifier.config.WebMvcConfiguration3;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @description:
 * @author: xuefei
 * @date: 2023/07/30 22:14
 */
public class Qualifier3App {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(WebMvcConfiguration3.class);
        WebMvcConfiguration3 bean = context.getBean(WebMvcConfiguration3.class);
        // 打印字段的值
        System.out.println(bean.person);

    }


}
