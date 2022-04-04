package com.xuefei.spring;

import com.xuefei.spring.service.MyService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author xuefei
 */
@SpringBootApplication
public class XuefeiSpringApplication {

    public static void main(String[] args) {
//        ConfigurableApplicationContext context = SpringApplication.run(XuefeiSpringApplication.class, args);
//        MyService service = context.getBean(MyService.class);
//        System.out.println("service class:" + service.getClass());
//        service.foo();
//        context.close();
        MyService myService = new MyService();
        myService.foo();
    }

}
