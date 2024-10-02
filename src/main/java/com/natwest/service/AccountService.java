package com.natwest.service;

import com.natwest.dao.Accountdao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AccountService {
    @Autowired
    Accountdao accountdao;
   public void createAccount(){
        accountdao.createAccount();
        System.out.println("Account created");
        System.out.println("Business logic");
    }

}
