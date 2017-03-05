package com.vincent.lwx.bean;

import java.io.Serializable;

/**
 * description ：
 * project name：CoolApp
 * author : Vincent
 * creation date: 2017/3/5 2:10
 *
 * @version 1.0
 */

public class User implements Serializable {

    /**
     * 用户id
     */
    private String user_id;

    /**
     * 用户手机号码
     */
    private String phone;

    /**
     * 用户昵称
     */
    private String nickname;

    /**
     * 用户头像地址 线上地址url
     */
    private String head;

    /**
     * 用户性别
     */
    private String sex;

    /**
     * 用户生日
     */
    private String birthday;

    /**
     * 用户发的个人签名（或状态）
     */
    private String live_status;



    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getHead() {
        return head;
    }

    public void setHead(String head) {
        this.head = head;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getLive_status() {
        return live_status;
    }

    public void setLive_status(String live_status) {
        this.live_status = live_status;
    }

    @Override
    public String toString() {
        return "User{" +
                "user_id='" + user_id + '\'' +
                ", phone='" + phone + '\'' +
                ", nickname='" + nickname + '\'' +
                ", head='" + head + '\'' +
                ", sex='" + sex + '\'' +
                ", birthday='" + birthday + '\'' +
                ", live_status='" + live_status + '\'' +
                '}';
    }
}
