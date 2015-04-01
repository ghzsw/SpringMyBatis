package com.test.service;

import com.test.domain.User;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by zsw on 15-3-16.
 */
public class UserServiceTest {

    private Iservice userService;

    @Before
    public void before(){
        @SuppressWarnings("resource")
        ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"classpath:spring/spring*.xml"
        });
        userService = (Iservice) context.getBean("userService");
    }

    @Test
    public void addUser(){
        /*name VARCHAR (255) NOT NULL,
        email VARCHAR (255) NOT NULL,
        password VARCHAR (255) NOT NULL ,
        account VARCHAR (255) NOT NULL ,*/
        User user = new User();
        user.setId("ss");
        user.setName("zsw");
        user.setAccount("zsw");
        user.setPassword("zsw");
        user.setEmail("12@sina.com");

        System.out.println(userService.insert(user));
    }

    @Test
    public void queryAll(){

        System.err.
                println(userService.getAll());
    }
}
