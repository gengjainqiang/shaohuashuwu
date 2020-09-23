package com.shaohuashuwu.domain;

public class ReadSettingInfo {

    private int setting_id;             //设置信息ID
    private int setting_theme;          //设置主题
    private int setting_font_type;      //设置字体类型
    private int setting_font_size;      //设置字体大小
    private int user_id;                //用户id

    public ReadSettingInfo() {
    }

    public ReadSettingInfo(int setting_id, int setting_theme, int setting_font_type, int setting_font_size, int user_id) {
        this.setting_id = setting_id;
        this.setting_theme = setting_theme;
        this.setting_font_type = setting_font_type;
        this.setting_font_size = setting_font_size;
        this.user_id = user_id;
    }

    public ReadSettingInfo(int setting_theme, int setting_font_type, int setting_font_size, int user_id) {
        this.setting_theme = setting_theme;
        this.setting_font_type = setting_font_type;
        this.setting_font_size = setting_font_size;
        this.user_id = user_id;
    }

    public int getSetting_id() {
        return setting_id;
    }

    public void setSetting_id(int setting_id) {
        this.setting_id = setting_id;
    }

    public int getSetting_theme() {
        return setting_theme;
    }

    public void setSetting_theme(int setting_theme) {
        this.setting_theme = setting_theme;
    }

    public int getSetting_font_type() {
        return setting_font_type;
    }

    public void setSetting_font_type(int setting_font_type) {
        this.setting_font_type = setting_font_type;
    }

    public int getSetting_font_size() {
        return setting_font_size;
    }

    public void setSetting_font_size(int setting_font_size) {
        this.setting_font_size = setting_font_size;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }


    @Override
    public String toString() {
        return "ReadSettingInfo{" +
                "setting_id=" + setting_id +
                ", setting_theme=" + setting_theme +
                ", setting_font_type=" + setting_font_type +
                ", setting_font_size=" + setting_font_size +
                ", user_id=" + user_id +
                '}';
    }
}
