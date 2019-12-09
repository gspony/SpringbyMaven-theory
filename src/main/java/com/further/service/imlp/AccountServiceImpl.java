package com.further.service.imlp;

import com.further.dao.IAccountDao;
import com.further.dao.impl.AccountDaoImpl;
import com.further.factory.BeanFactory;
import com.further.service.IAccountService;

/**
 * @Classname AccountServiceImpl
 * @Description TODO
 * @Author 马维俊
 * @Version V1.0.0
 * @Date 2019/12/6 11:12
 */
public class AccountServiceImpl implements IAccountService {
    //private  IAccountDao accountDao = new AccountDaoImpl();
    /**
     *
     *
     */
    private  IAccountDao accountDao =(IAccountDao) BeanFactory.getBean("accountDao");
    public void saveAccount() {
        accountDao.saveAccount();
    }
}
