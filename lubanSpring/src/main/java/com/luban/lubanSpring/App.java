package com.luban.lubanSpring;

import org.spring.util.BeanFactory;

import com.luban.service.UserService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        BeanFactory beanFactory = new BeanFactory("spring.xml");
        UserService service = (UserService) beanFactory.getBean("service");
        service.find();
    }
}
