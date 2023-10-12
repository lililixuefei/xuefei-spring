package com.xuefei.factoryBean;

/**
 * @description:
 * @author: xuefei
 * @date: 2023/10/12 18:35
 */
public class Author {

    private String name;
    private Integer age;

    private Author() {
    }

    public Author(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public static Author init(String name, Integer age) {
        Author author = new Author();
        author.setAge(age);
        author.setName(name);
        return author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
