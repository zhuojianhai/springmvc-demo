package com.zjh.test;

/**
 * @RunWith：用于指定junit运行环境，是junit提供给其他框架测试环境接口扩展，
 * 为了便于使用spring的依赖注入，spring提供了org.springframework.test.context.junit4.SpringJUnit4ClassRunner作为Junit测试环境
 * @ContextConfiguration({"classpath:applicationContext.xml","classpath:spring/buyer/applicationContext-service.xml"})
 * 导入配置文件，这里我的applicationContext配置文件是根据模块来分类的。如果有多个模块就引入多个“applicationContext-service.xml”文件。如果所有的都是写在“applicationContext。xml”中则这样导入：
 * @ContextConfiguration(locations = "classpath:applicationContext.xml")
 * @TransactionConfiguration(transactionManager = "transactionManager", defaultRollback = true)这里的事务关联到配置文件中的事务控制器（transactionManager = "transactionManager"），同时指定自动回滚（defaultRollback = true）。这样做操作的数据才不会污染数据库！
 * @Transactional:这个非常关键，如果不加入这个注解配置，事务控制就会完全失效！
 *
 * AbstractTransactionalDataSourceSpringContextTests要想构建这一系列的无污染纯绿色事务测试框架就必须找
 *
 * 到这个基类！（即所有事务均不生效）
 */
public class UserTest {
}
