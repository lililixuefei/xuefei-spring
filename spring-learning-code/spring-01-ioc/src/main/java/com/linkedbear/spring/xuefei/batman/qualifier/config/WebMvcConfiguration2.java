package com.linkedbear.spring.xuefei.batman.qualifier.config;

import com.linkedbear.spring.xuefei.batman.qualifier.bean.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.List;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;

/**
 * @description:
 * @author: xuefei
 * @date: 2023/07/30 22:16
 */
@Configuration
public class WebMvcConfiguration2 {

    @MyAnno // 会把所有标注有此注解的Bean都收入囊中，请List装（因为会有多个）
    @Autowired
    public List<Person> person;

    @MyAnno
    @Bean
    public Person person1() {
        return new Person("fsx01", 16);
    }

    @MyAnno
    @Bean
    public Person person2() {
        return new Person("fsx02", 18);
    }

    // 自定义注解：上面标注有@Qualifier注解
    @Target({FIELD, METHOD})
    @Retention(RetentionPolicy.RUNTIME)
    @Qualifier
    @interface MyAnno {
    }

}

