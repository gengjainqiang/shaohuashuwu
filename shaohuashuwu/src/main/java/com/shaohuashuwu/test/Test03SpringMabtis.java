package com.shaohuashuwu.test;


import com.shaohuashuwu.domain.Account;
import com.shaohuashuwu.service.AccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Collections;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class Test03SpringMabtis {
    @Autowired
    private AccountService accountService;

    @Test
    public void testFindAll(){
        List list = accountService.findAll();

        System.out.println(list);
    }
    @Test
    public void testFindAll2(){
        Account account = new Account();

        account.setName("刀下留人");
        account.setMoney(2323d);
        accountService.saveAccount(account);
       // System.out.println(list);
    }
    @Test
    public void testFindAll3(){
       Account account = new Account("5201314");
        //account.setMoney(2323d);
        accountService.saveAccount2(account);
        // System.out.println(list);
    }


    
}
