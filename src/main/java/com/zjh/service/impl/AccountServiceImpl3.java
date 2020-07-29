package com.zjh.service.impl;

import com.zjh.dao.IAccountDao;
import com.zjh.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 用于创建对象的
 *          他们的作用就和在xml中配置编写一个bean标签一样
 *          Component
 *              作用：把当前对象注入到spring容器中
 *              属性：value 用于指定bean的id，默认是当前类名，且首字母改小写
 *          Controller:一般用于表现层
 *
 *          Service:一般用于业务层
 *
 *          Repository:一般用于持久层
 *
 *          这三个注解和component作用一模一样，这是spring框架为我们提供明确的三层使用的注解
 *
 * 用于注入数据的
 *      他们作用和在xml配置文件bean标签中写一个<property/>标签作用是一样的
 *      Autowired:
 *          按照类型注入，只要容器中有唯一的一个bean对象类型和要注入的变量类型匹配，就可注入成功
 *          出现位置：可以出现在成员属性，方法上
 *
 */
@Service(value = "accountServiceId3")
public class AccountServiceImpl3 implements IAccountService {

    @Autowired
    @Qualifier("accountDao1")
    IAccountDao dao;
    public AccountServiceImpl3(){
        System.out.println("AccountServiceImpl3 对象创建了" );

    }
    @Override
    public void saveAccount() {
        if (dao!=null) {
            dao.saveAccount();
        }
        System.out.println("saveAccount method is executed ");
    }
}
