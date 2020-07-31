package com.zjh.jdbctemplate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class JdbcTempleateDemo2 {
    public static void main(String[] args) {
        /**
         * 1、获取容器
         */
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config.xml");
        JdbcTemplate jt = (JdbcTemplate) applicationContext.getBean("jdbcTemplate");

        String sql = "insert into student(name,age,sex,class_id)values('America',31,'M',1)";
        jt.execute(sql);
    }

}
