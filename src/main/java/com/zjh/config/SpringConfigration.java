package com.zjh.config;

import com.zjh.domain.User;
import org.springframework.context.annotation.*;

import java.util.Date;

/**Configuration
 *      作用和spring-config.xml 作用一样
 * ComponentScan
 *          作用和spring-config.xml 文件中的  <context:component-scan base-package="com.zjh"> 标签一样的
 *          告知spring容器，需要扫描的包
 * import:
 *      导入其他的配置类
 *       属性：
 *       value：用于配置其他配置类字节码
 *              当我们使用import的注解之后，有import注解就是父配置类，而导入的是子配置类\
 * PropertySource:
 *          作用：用于指定properties文件的位置
 *          属性：
 *          value  指定文件的名称和路径
 *                  关键字calsspath 指定类路径
 *
 */

@Configuration
@ComponentScan(value = {"com.zjh.dao","com.zjh.service"})
@Import(JDBCConfitration.class)
@PropertySource("classpath:jdbcConfigration.properties")
public class SpringConfigration {

    /**
     * 创建的实体类，放入spring容器
     * @return
     */
    @Bean(value = "user")
    @Scope(value = "singleton")
    public User getUser(){
        User user = new User();
        user.setDate(new Date());
        user.setUsername("zhuojianhai");
        user.setPassword("123456");
        user.setAge(30);
        return  user;
    }
}
