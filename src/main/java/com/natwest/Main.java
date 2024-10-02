package com.natwest;

import com.natwest.dao.Accountdao;
import com.natwest.service.AccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext apc=new AnnotationConfigApplicationContext("com.natwest");
//        Accountdao accountdao=(Accountdao) apc.getBean("accountdao");
//        accountdao.createAccount();

        System.out.println("==================================");

//        AccountService accountService=(AccountService) apc.getBean("accountService");
//        accountService.createAccount(       Accountdao accountdao=(Accountdao) apc.getBean("accountdao");
        accountdao.createAccount();
        


    }
}