package com.xuefei.factoryBean;

import org.springframework.beans.factory.FactoryBean;

/**
 * @description:
 * @author: xuefei
 * @date: 2023/10/12 18:36
 */
public class AuthorFactoryBean implements FactoryBean<Author> {

    @Override
    public Author getObject() throws Exception {
        return Author.init("javaboy", 99);
    }

    @Override
    public Class<?> getObjectType() {
        return Author.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }

}
