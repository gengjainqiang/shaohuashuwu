package com.shaohuashuwu.service.impl;

import com.shaohuashuwu.dao.AccountDao;
import com.shaohuashuwu.domain.Account;
import com.shaohuashuwu.service.AccountService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("accountService")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)//查
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountDao accountDao;

    @Override
    public List<Account> findAll() {
        System.out.println("查询所有账户");
        return accountDao.findAll();
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, readOnly = false)//增删改
    public void saveAccount(Account account) {
        System.out.println("业务层，保存账户----");
        accountDao.saveAccount(account);
    }

    @Override
    public void saveAccount2(Account account) {
        System.out.println("业务层，保存账户----");
        accountDao.saveAccount2(account);
    }


}
