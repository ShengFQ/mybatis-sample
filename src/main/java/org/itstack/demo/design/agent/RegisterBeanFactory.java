package org.itstack.demo.design.agent;

import org.itstack.demo.design.mapper.UserMapper;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinitionHolder;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionReaderUtils;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.beans.factory.support.GenericBeanDefinition;
/**
 * @author shengfq
 * @desc spring-Context的托管注册器,注册到DefaultListableBeanFactory
 * @date 2020年09月26日
 * */
public class RegisterBeanFactory implements BeanDefinitionRegistryPostProcessor {

    @Override
    public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
        //托管MapperFactoryBean代理对象,给构造器添加参数
        GenericBeanDefinition beanDefinition = new GenericBeanDefinition();
        beanDefinition.setBeanClass(MapperFactoryBean.class);
        beanDefinition.setScope("singleton");
        beanDefinition.getConstructorArgumentValues().addGenericArgumentValue(UserMapper.class);

        BeanDefinitionHolder definitionHolder = new BeanDefinitionHolder(beanDefinition, "userDao");
        //进行bean的注册，也就是注册到DefaultListableBeanFactory
        BeanDefinitionReaderUtils.registerBeanDefinition(definitionHolder, registry);
    }

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException {
        // left intentionally blank
    }

}