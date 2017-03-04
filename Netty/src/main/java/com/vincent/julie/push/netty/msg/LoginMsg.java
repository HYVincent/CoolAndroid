package com.vincent.julie.push.netty.msg;

/**
 * 登录验证消息类型
 *
 * @author 徐飞
 * @version 2016/02/24 19:40
 */
public class LoginMsg extends BaseMsg {
    private String imie;

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }
}
