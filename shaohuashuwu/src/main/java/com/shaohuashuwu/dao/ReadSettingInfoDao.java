package com.shaohuashuwu.dao;

import com.shaohuashuwu.domain.ReadSettingInfo;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

@Repository
public interface ReadSettingInfoDao {

    //添加用户阅读设置
    @Insert("Insert " +
            " into read_setting_info " +
            " (setting_theme,setting_font_type,setting_font_size,user_id)" +
            " values (#{setting_theme},#{setting_font_type},#{setting_font_size},#{user_id})")
    public int insertReadSetting(ReadSettingInfo readSettingInfo);

    //查找用户阅读设置
    @Select("Select *" +
            " from read_setting_info " +
            "where user_id = #{user_id}")
    public ReadSettingInfo selectReadSettingbyuser_id(Integer user_id);

    //修改用户阅读设置
    @Update("Update read_setting_info " +
            " set setting_theme = #{setting_theme},setting_font_type = #{setting_font_type}, setting_font_size = #{setting_font_size}")
    public int updateReadSetting(ReadSettingInfo readSettingInfo);


}
