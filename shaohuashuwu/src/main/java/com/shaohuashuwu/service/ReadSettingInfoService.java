package com.shaohuashuwu.service;


import com.shaohuashuwu.domain.ReadSettingInfo;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface ReadSettingInfoService {

    //添加用户阅读设置
    public Boolean insertReadSetting(ReadSettingInfo readSettingInfo);

    //查找用户阅读设置
    public ReadSettingInfo selectReadSettingbyuser_id(Integer user_id);

    //修改用户阅读设置
    public Boolean updateReadSetting(ReadSettingInfo readSettingInfo);

}
