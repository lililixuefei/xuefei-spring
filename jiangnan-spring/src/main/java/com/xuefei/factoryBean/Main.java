package com.xuefei.factoryBean;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * https://mp.weixin.qq.com/s?__biz=MzI1NDY0MTkzNQ==&mid=2247504401&idx=1&sn=e5500a1e3b14a8b051744adc2d7e2fd7&chksm=e9c08071deb70967fde49def92eab598a47317d88bee60fc1e52d0ab0efb790a475cfd665cfa&scene=178&cur_album_id=2107713769630941184#rd
 *
 * @description:
 * @author: xuefei
 * @date: 2023/10/12 18:39
 */
public class Main {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("factoryBean/applicationContext.xml");
        Object author = ctx.getBean("author");
//        Object authorFactoryBean = ctx.getBean("&author");

        System.out.println(author);

        System.out.println("author.getClass() = " + author.getClass());
//        System.out.println("authorFactoryBean.getClass() = " + authorFactoryBean.getClass());


//        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext("com.xuefei.factoryBean");
//        Object author = applicationContext.getBean("author");
//        System.out.println(author);


    }

}
