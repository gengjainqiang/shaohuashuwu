package com.shaohuashuwu.service.impl;

import com.shaohuashuwu.dao.ReadSettingInfoDao;
import com.shaohuashuwu.domain.ReadSettingInfo;
import com.shaohuashuwu.service.ReadSettingInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 章节业务层
 */
@Service("readSettingInfoService")
public class ReadSettingInfoServiceImpl  implements ReadSettingInfoService {

    @Autowired
    private ReadSettingInfoDao readSettingInfoDao;
    private ReadSettingInfo readSettingInfo;


    /**
     * 添加用户阅读设置
     * @param readSettingInfo
     * @return
     */
    @Override
    public Boolean insertReadSetting(ReadSettingInfo readSettingInfo) {
        int result = readSettingInfoDao.insertReadSetting(readSettingInfo);
        if (result != 0){
            return true;
        }else {
            return false;
        }

    }

    @Override
    public ReadSettingInfo selectReadSettingbyuser_id(Integer user_id) {
        readSettingInfo = readSettingInfoDao.selectReadSettingbyuser_id(user_id);
        System.out.println("阅读设置------"+readSettingInfo);
        return readSettingInfo;
    }

    @Override
    public Boolean updateReadSetting(ReadSettingInfo readSettingInfo) {
        int result = readSettingInfoDao.updateReadSetting(readSettingInfo);
        if (result != 0){
            return true;
        }else {
            return false;
        }

    }

}
