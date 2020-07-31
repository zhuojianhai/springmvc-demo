package com.zjh.jdbctemplate;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class JdbcTempleateDemo1 {
    public static void main(String[] args) {
        //准备数据源
        DriverManagerDataSource ds = new DriverManagerDataSource();
        ds.setDriverClassName("com.mysql.jdbc.Driver");
        ds.setUrl("jdbc:mysql://localhost:3306/learndb");
        ds.setUsername("root");
        ds.setPassword("123456");

        JdbcTemplate jt = new JdbcTemplate();
        jt.setDataSource(ds);
        String sql = "insert into student(name,age,sex,class_id)values('china',30,'M',1)";
        jt.execute(sql);

        String delete = "delete from student where id=11 or id=12";
        jt.execute(delete);
    }
}
