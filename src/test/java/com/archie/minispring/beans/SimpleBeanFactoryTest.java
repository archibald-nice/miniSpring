package com.archie.minispring.beans;

import com.archie.minispring.beans.factory.support.SimpleBeanFactory;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleBeanFactoryTest {

    private SimpleBeanFactory beanFactory;

    @BeforeEach
    void setUp() {
        beanFactory = new SimpleBeanFactory();
    }

    @Test
    void testSimpleBeanFactory() {
        TestBean testBean = new TestBean();
        testBean.setName("Archie");
        beanFactory.registerBean("testBean", testBean);
        TestBean bean = (TestBean) beanFactory.getBean("testBean");
        assertTrue(beanFactory.containsBean("testBean"));
    }

    /**
     * 用于测试的简单Bean类
     */
    static class TestBean {
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

}
