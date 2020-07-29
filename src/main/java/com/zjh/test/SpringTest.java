package com.zjh.test;

import com.zjh.dao.IAccountDao;
import com.zjh.domain.User;
import com.zjh.service.IAccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config.xml");
        User user = (User) applicationContext.getBean("user");
        System.out.println(user.toString());
        System.out.println(user.getDate());

        /**以下对象是通过注解方式创建的对象*/
        IAccountService iAccountService = (IAccountService) applicationContext.getBean("accountServiceId");
        iAccountService.saveAccount();

        IAccountDao iAccountDao = (IAccountDao) applicationContext.getBean("accountDao");
        iAccountDao.saveAccount();


        iAccountService.saveAccount();
        /**以下对象是通过注解方式创建的对象*/
    }
}
