package com.archie.minispring.beans.factory.support;

import com.archie.minispring.beans.factory.BeanFactory;
import com.archie.minispring.beans.factory.config.BeanDefinition;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class SimpleBeanFactory implements BeanFactory {

    private final Map<String, Object> beanMap = new ConcurrentHashMap<>();

    @Override
    public Object getBean(String name) {
        return beanMap.get(name);
    }

    @Override
    public void registerBean(String name, Object bean) {
        beanMap.put(name, bean);
    }

    @Override
    public boolean containsBean(String name) {
        return beanMap.containsKey(name);
    }
}
