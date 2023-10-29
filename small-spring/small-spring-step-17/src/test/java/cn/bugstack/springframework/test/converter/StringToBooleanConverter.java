package cn.bugstack.springframework.test.converter;

import cn.bugstack.springframework.core.convert.converter.GenericConverter;

import java.util.Collections;
import java.util.Set;

/**
 * @Description
 * @Author xuefei
 * @Date 2023/10/29 13:17
 * @Version 1.0
 */
public class StringToBooleanConverter implements GenericConverter {

    @Override
    public Set<ConvertiblePair> getConvertibleTypes() {
        return Collections.singleton(new ConvertiblePair(String.class, Boolean.class));
    }

    @Override
    public Object convert(Object source, Class sourceType, Class targetType) {
        return Boolean.valueOf((String) source);
    }

}
