package com.zjh.test;

import com.zjh.domain.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * spring 整合junit配置
 *          1、导入spring整合的junit jar包，即
 *          <dependency>
 *             <groupId>org.springframework</groupId>
 *             <artifactId>spring-test</artifactId>
 *             <version>${spring.version}</version>
 *         </dependency>
 *         2、使用junit提供的一个注解把原有的main方法替换了，替换成spring提供的
 *                  @Runwith 替换成运行器
 *
 *         3、告知spring的运行器，spring和ioc创建是基于xml的还是基于注解的，并且说明位置
 *                  @ContextConfigration
 *                  location:指定文件位置，加上classpath关键字，表示类路径
 *                  classes：指定注解类所在位置
 *
 *          当我们使用spring 5.x时候，junit的版本必须 为4.12 以上
 */

@RunWith(SpringJUnit4ClassRunner.class) //使用junit4进行测试
@ContextConfiguration(locations={"classpath:spring-config.xml"}) //加载配置文件
//------------如果加入以下代码，所有继承该类的测试类都会遵循该配置，也可以不加，在测试类的方法上///控制事务，参见下一个实例
//这个非常关键，如果不加入这个注解配置，事务控制就会完全失效！
//@Transactional
//这里的事务关联到配置文件中的事务控制器（transactionManager = "transactionManager"），同时//指定自动回滚（defaultRollback = true）。这样做操作的数据才不会污染数据库！
//@TransactionConfiguration(transactionManager = "transactionManager", defaultRollback = true)
//------------
public class AccountServiceTest {
    @Autowired
    User user;
    @Test
    public void testUser(){
        System.out.println(user);
    }
}
