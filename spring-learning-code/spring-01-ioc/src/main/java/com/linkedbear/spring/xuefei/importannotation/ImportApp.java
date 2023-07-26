package com.linkedbear.spring.xuefei.importannotation;

import com.linkedbear.spring.xuefei.importannotation.bean.Element01;
import com.linkedbear.spring.xuefei.importannotation.bean.Element02;
import com.linkedbear.spring.xuefei.importannotation.bean.Element03;
import com.linkedbear.spring.xuefei.importannotation.bean.Element04;
import com.linkedbear.spring.xuefei.importannotation.config.EnableElement;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @link: https://my.oschina.net/funcy/blog/4678152
 * @description:
 * @author: xuefei
 * @date: 2023/07/19 19:20
 */
@EnableElement
public class ImportApp {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ImportApp.class);

        Element01 element01 = context.getBean(Element01.class);
        System.out.println(element01.desc());

        Element02 element02 = context.getBean(Element02.class);
        System.out.println(element02.desc());

        Element03 element03 = context.getBean(Element03.class);
        System.out.println(element03.desc());

        Element04 element04 = context.getBean(Element04.class);
        System.out.println(element04.desc());
    }

}
