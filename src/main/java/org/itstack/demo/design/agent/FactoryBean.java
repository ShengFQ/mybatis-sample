package org.itstack.demo.design.agent;

public interface FactoryBean<T> {
    /**
     * 代理接口
     * */
     T getObject() throws Exception;

     Class<?> getObjectType();

     boolean isSingleton();
}
