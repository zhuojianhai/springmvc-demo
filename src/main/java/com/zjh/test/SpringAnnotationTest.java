package com.zjh.test;

import com.zjh.config.SpringConfigration;
import com.zjh.domain.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringAnnotationTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfigration.class);
        User user1 = (User) applicationContext.getBean("user");
        User user2 = (User) applicationContext.getBean("user");
        System.out.println("user1 == user2  " +(user1==user2));

    }
}
