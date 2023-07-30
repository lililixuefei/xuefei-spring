package com.linkedbear.spring.xuefei.metadata;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.core.type.ClassMetadata;
import org.springframework.core.type.classreading.CachingMetadataReaderFactory;
import org.springframework.core.type.classreading.MetadataReader;

import java.io.IOException;

/**
 * @description:
 * @author: xuefei
 * @date: 2023/07/30 22:07
 */
public class MetaResourceApp {

    public static void main(String[] args) throws IOException {
        CachingMetadataReaderFactory readerFactory = new CachingMetadataReaderFactory();
        // 下面两种初始化方式都可，效果一样
        //MetadataReader metadataReader = readerFactory.getMetadataReader(MetaDemo.class.getName());
        MetadataReader metadataReader = readerFactory.getMetadataReader(new ClassPathResource("com/linkedbear/spring/xuefei/metadata/MetaDemo.class"));

        ClassMetadata classMetadata = metadataReader.getClassMetadata();
        AnnotationMetadata annotationMetadata = metadataReader.getAnnotationMetadata();
        Resource resource = metadataReader.getResource();

        System.out.println(classMetadata); // org.springframework.core.type.classreading.AnnotationMetadataReadingVisitor@79079097
        System.out.println(annotationMetadata); // org.springframework.core.type.classreading.AnnotationMetadataReadingVisitor@79079097
        System.out.println(resource); // class path resource [com/fsx/maintest/MetaDemo.class]

    }


}
