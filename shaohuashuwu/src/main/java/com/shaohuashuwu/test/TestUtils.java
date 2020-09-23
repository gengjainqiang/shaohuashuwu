package com.shaohuashuwu.test;


import com.shaohuashuwu.domain.Account;
import com.shaohuashuwu.utils.SortUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class TestUtils {
    @Autowired
    private SortUtil sortUtil;

    //测试排序算法
    @Test
    public void testsortbbyAllrecommend(){
        ArrayList<Account> list = new ArrayList<Account>();
        list.add(new Account("李四",24d));
        list.add(new Account("张三",13d));
        list.add(new Account("王五",25d));

        List<Account> account = sortUtil.sortbbyAllrecommend(list);
        System.out.println("后--"+account);


    }

}
