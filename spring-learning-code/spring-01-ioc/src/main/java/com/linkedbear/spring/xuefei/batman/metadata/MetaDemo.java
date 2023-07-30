package com.linkedbear.spring.xuefei.batman.metadata;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.HashMap;

/**
 * @description:
 * @author: xuefei
 * @date: 2023/07/30 21:55
 */
@Repository("repositoryName")
@Service("serviceName")
@EnableAsync
public class MetaDemo extends HashMap<String, String> implements Serializable {
    private static class InnerClass {
    }

    @Autowired
    private String getName() {
        return "demo";
    }
}

