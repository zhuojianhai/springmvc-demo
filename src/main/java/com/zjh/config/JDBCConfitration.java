package com.zjh.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JDBCConfitration {

    /**
     * @Value 是jdk类注解
     * 里面的值，是 jdbcconfigration.properties 文件里面的key值
     */
    @Value("${jdbc.driver}")
    private String driver;

    @Value("${jdbc.url}")
    private String url;

    @Value("${jdbc.username}")
    private String username;
    @Value("${jdbc.password}")
    private String password;



}
