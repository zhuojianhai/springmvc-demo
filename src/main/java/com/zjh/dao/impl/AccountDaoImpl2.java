package com.zjh.dao.impl;

import com.zjh.dao.IAccountDao;
import org.springframework.stereotype.Repository;

@Repository(value = "accountDao1")
public class AccountDaoImpl2 implements IAccountDao {
    @Override
    public void saveAccount() {

        System.out.println("数据库保存了用户信息");
    }
}
