package com.further.ui;

import com.further.factory.BeanFactory;
import com.further.service.IAccountService;

/**
 * @Classname Main
 * @Description TODO
 * @Author mwj
 * @Version V1.0.0
 * @Date 2019/12/6 10:44
 */
public class Main {
    public static void main(String[] args) {
        IAccountService as =(IAccountService) BeanFactory.getBean("accountService");
        as.saveAccount();
    }
}
