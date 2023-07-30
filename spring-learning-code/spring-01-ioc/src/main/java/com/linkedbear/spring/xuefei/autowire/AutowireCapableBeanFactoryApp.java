package com.linkedbear.spring.xuefei.autowire;

import com.linkedbear.spring.xuefei.autowire.bean.Child;
import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * @link: https://fangshixiang.blog.csdn.net/article/details/88651128
 * @description:
 * @author: xuefei
 * @date: 2023/07/30 21:00
 */
@ComponentScan("com.linkedbear.spring.xuefei.autowire")
public class AutowireCapableBeanFactoryApp {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AutowireCapableBeanFactoryApp.class);
        // ApplicationContext里面是持久AutowireCapableBeanFactory这个工具的，它真实的实现类一般都是：DefaultListableBeanFactory
        AutowireCapableBeanFactory autowireCapableBeanFactory = applicationContext.getAutowireCapableBeanFactory();

        // 我们吧Child的创建过程都交给Bean工厂去帮我们处理，自己连new都不需要了 （createBean方法执行多次，就会创建多个child实例）
        Child child = (Child) autowireCapableBeanFactory.createBean(Child.class, AutowireCapableBeanFactory.AUTOWIRE_BY_TYPE, false);

        //简直残暴，没有@Autowired注解都给注入进来了~~~  至于为什么，看看下面的分析，你就知道了
        System.out.println(child.getHelloService());

        // 抛出异常 No qualifying bean of type 'com.fsx.bean.Child' available
        // 能佐证：我们的Bean并没交给Spring容器管理，它只是帮我们创建好了，并把对应属性注入进去了
        Child bean = applicationContext.getBean(Child.class);
        System.out.println(bean);
    }

}
