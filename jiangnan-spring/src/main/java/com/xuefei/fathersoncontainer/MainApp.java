package com.xuefei.fathersoncontainer;

import org.springframework.beans.factory.BeanFactoryUtils;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

/**
 * https://mp.weixin.qq.com/s?__biz=MzI1NDY0MTkzNQ==&mid=2247504499&idx=1&sn=851bb518c86c2ffeafd91b489c6710d2&chksm=e9c08013deb70905ac43ed94a98eb828a5b7f78a77a6b503b6fe472dc614964f3b5470c2d6c7&scene=178&cur_album_id=2107713769630941184#rd
 *
 * @Description
 * @Author xuefei
 * @Date 2023/10/15 20:57
 * @Version 1.0
 */
public class MainApp {

    public static void main(String[] args) {
//        test_1();

//        test_2();

//        test_3();

//        test_4();

//        test_5();

        test_6();

    }

    private static void test_6() {
        ClassPathXmlApplicationContext parent = new ClassPathXmlApplicationContext("fathersoncontainer/consumer_beans.xml");
        ClassPathXmlApplicationContext child = new ClassPathXmlApplicationContext("fathersoncontainer/merchant_beans.xml");
        child.setParent(parent);
        child.refresh();
        String[] names = BeanFactoryUtils.beanNamesForTypeIncludingAncestors(parent, com.xuefei.fathersoncontainer.consumer.RoleService.class);
        for (String name : names) {
            System.out.println("name = " + name);
        }
    }

    private static void test_5() {
        ClassPathXmlApplicationContext parent = new ClassPathXmlApplicationContext("fathersoncontainer/consumer_beans.xml");
        ClassPathXmlApplicationContext child = new ClassPathXmlApplicationContext("fathersoncontainer/merchant_beans.xml");
        child.setParent(parent);
        child.refresh();
        // 根据类型去查找 Bean 名称的时候，我们所用的是 getBeanNamesForType 方法，这个方法是由 ListableBeanFactory 接口提供的，
        // 而该接口和 HierarchicalBeanFactory 接口并无继承关系，所以 getBeanNamesForType 方法并不支持去父容器中查找 Bean，它只在当前容器中查找 Bean。
        String[] names1 = child.getBeanNamesForType(com.xuefei.fathersoncontainer.merchant.RoleService.class);
        String[] names2 = child.getBeanNamesForType(com.xuefei.fathersoncontainer.consumer.RoleService.class);
        System.out.println("names1 = " + Arrays.toString(names1));
        System.out.println("names2 = " + Arrays.toString(names2));


    }

    private static void test_4() {
        ClassPathXmlApplicationContext parent = new ClassPathXmlApplicationContext("fathersoncontainer/consumer_beans.xml");
        ClassPathXmlApplicationContext child = new ClassPathXmlApplicationContext("fathersoncontainer/merchant_beans.xml");
        child.setParent(parent);
        child.refresh();
        // 当子容器调用 getBean 方法去获取一个 Bean 的时候，如果当前容器没找到，就会去父容器查找，一直往上找，找到为止。
        com.xuefei.fathersoncontainer.consumer.RoleService rs1 = parent.getBean(com.xuefei.fathersoncontainer.consumer.RoleService.class);
        com.xuefei.fathersoncontainer.merchant.RoleService rs2 = child.getBean(com.xuefei.fathersoncontainer.merchant.RoleService.class);
        com.xuefei.fathersoncontainer.consumer.RoleService rs3 = child.getBean(com.xuefei.fathersoncontainer.consumer.RoleService.class);
        System.out.println("rs1.hello() = " + rs1.hello());
        System.out.println("rs2.hello() = " + rs2.hello());
        System.out.println("rs3.hello() = " + rs3.hello());
    }

    private static void test_3() {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext();
        ClassPathXmlApplicationContext child1 = new ClassPathXmlApplicationContext("fathersoncontainer/consumer_beans.xml");
        ClassPathXmlApplicationContext child2 = new ClassPathXmlApplicationContext("fathersoncontainer/merchant_beans.xml");
        // 兄弟关系
        child1.setParent(ctx);
        child2.setParent(ctx);
        ctx.setAllowBeanDefinitionOverriding(false);
        ctx.refresh();
        com.xuefei.fathersoncontainer.consumer.RoleService rs1 = child1.getBean(com.xuefei.fathersoncontainer.consumer.RoleService.class);
        com.xuefei.fathersoncontainer.merchant.RoleService rs2 = child2.getBean(com.xuefei.fathersoncontainer.merchant.RoleService.class);
        System.out.println("rs1.hello() = " + rs1.hello());
        System.out.println("rs2.hello() = " + rs2.hello());
    }

    private static void test_2() {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext();
        ctx.setConfigLocations("fathersoncontainer/consumer_beans.xml", "fathersoncontainer/merchant_beans.xml");
        // 如果不允许 Bean 的覆盖
        ctx.setAllowBeanDefinitionOverriding(false);
        ctx.refresh();
    }

    private static void test_1() {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext();
        ctx.setConfigLocations("fathersoncontainer/consumer_beans.xml", "fathersoncontainer/merchant_beans.xml");
        ctx.refresh();
        // 这个是找不到 org.javaboy.consumer.RoleService 服务，但是另外一个 RoleService 其实是找到了，因为默认情况下后面定义的同名 Bean 把前面的覆盖了
        com.xuefei.fathersoncontainer.merchant.RoleService rs1 = ctx.getBean(com.xuefei.fathersoncontainer.merchant.RoleService.class);
        com.xuefei.fathersoncontainer.consumer.RoleService rs2 = ctx.getBean(com.xuefei.fathersoncontainer.consumer.RoleService.class);
    }

}
