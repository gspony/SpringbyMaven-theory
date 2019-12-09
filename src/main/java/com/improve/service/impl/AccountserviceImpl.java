package com.improve.service.impl;

import com.improve.dao.IAccountDao;
import com.improve.dao.impl.AccountDaoImpl;
import com.improve.service.IAccountservice;

/**
 * @Classname AccountserviceImpl
 * @Description TODO
 * @Author mwj
 * @Version V1.0.0
 * @Date 2019/12/6 10:08
 */
public class AccountserviceImpl implements IAccountservice {
    private IAccountDao accountDao = new AccountDaoImpl();
    public void saveAccount() {
    accountDao.saveAccount();
    }
}
