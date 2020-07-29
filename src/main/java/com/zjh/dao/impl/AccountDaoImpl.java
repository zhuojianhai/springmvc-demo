package com.zjh.dao.impl;

import com.zjh.dao.IAccountDao;
import org.springframework.stereotype.Repository;

/**
 * value = accountDao
 * 指定了这个类的id
 */
@Repository(value = "accountDao")
public class AccountDaoImpl implements IAccountDao {
    @Override
    public void saveAccount() {

        System.out.println("数据库保存了用户信息");
    }
}
