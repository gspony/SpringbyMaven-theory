package com.improve.ui;

import com.improve.service.IAccountservice;
import com.improve.service.impl.AccountserviceImpl;

/**
 * @Classname Main
 * @Description TODO
 * @Author mwj
 * @Version V1.0.0
 * @Date 2019/12/6 10:18
 */
public class Main {
    public static void main(String[] args) {
        IAccountservice as = new AccountserviceImpl();
        as.saveAccount();
    }
}
