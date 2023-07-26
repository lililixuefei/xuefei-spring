package com.linkedbear.spring.xuefei.importannotation.config;

import com.linkedbear.spring.xuefei.importannotation.bean.Element03;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @description:
 * @author: xuefei
 * @date: 2023/07/19 19:19
 */
public class Element03Selector implements ImportSelector {

    /**
     * 返回String 为 包名.类名
     * 由于后面要用到反射，因此必须是"包名.类名"
     * @param importingClassMetadata
     * @return
     */
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        return new String[] {Element03.class.getName()};
    }

}
