package com.archie.minispring.beans.factory;

public interface BeanFactory {

    Object getBean(String name);

    void registerBean(String name, Object bean);

    boolean containsBean(String name);

}
