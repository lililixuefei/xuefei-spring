package com.xuefei.spring.aop.simulation.cglib;

/**
 * @description:
 * @author: xuefei
 * @date: 2022/04/05 19:58
 */
public class Target {

    public void save(){
        System.out.println("save()");
    }

    public void save(int i){
        System.out.println("save(int)");
    }

    public void save(long j){
        System.out.println("save(long)");
    }
}
