package org.itstack.demo.design;

import jdk.nashorn.internal.runtime.logging.Logger;
import org.itstack.demo.design.mapper.UserMapper;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@Logger
public class TestUserMapper {


    @Test
    public void testQueryUserInfo() {
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("spring-config.xml");
        UserMapper userDao = beanFactory.getBean("userDao", UserMapper.class);
        String res = userDao.queryUserInfo("100001");
        System.out.println("测试结果:"+ res);
    }
}
