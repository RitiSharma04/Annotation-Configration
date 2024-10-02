package com.natwest.dao;

import com.natwest.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component   ////it act like a bean
public class Accountdao {
    @Autowired
    AccountService accountService;
    public void createAccount(){
        System.out.println("Database logic");
    }
}
