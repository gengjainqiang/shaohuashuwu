package com.shaohuashuwu.test;

import com.shaohuashuwu.domain.ReadSettingInfo;
import com.shaohuashuwu.service.ReadSettingInfoService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class TestReadSetting {

    @Autowired
    private ReadSettingInfoService readSettingInfoService;
    private ReadSettingInfo readSettingInfo;

    //添加阅读设置
    @Test
    public void testinsertReadSetting() {
        readSettingInfo = new ReadSettingInfo(1,1,1,1);
        Boolean result = readSettingInfoService.insertReadSetting(readSettingInfo);
        System.out.println("1111--"+result);
    }


    //获取设置
    @Test
    public void testselectReadSettingbyuser_id() {
        //readSettingInfo = new ReadSettingInfo(1,1,1,1);
        readSettingInfo  = readSettingInfoService.selectReadSettingbyuser_id(4);
        System.out.println("1111--：："+readSettingInfo);
    }


    //修改阅读设置
    @Test
    public void testupdateReadSetting() {
        readSettingInfo = new ReadSettingInfo(2,2,2,4);
        Boolean result  = readSettingInfoService.updateReadSetting(readSettingInfo);
        System.out.println("1111--：："+result);
    }


    @Test
    public void testgit(){

    }
}
