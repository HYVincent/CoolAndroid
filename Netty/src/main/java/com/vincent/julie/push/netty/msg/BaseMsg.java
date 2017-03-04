package com.vincent.julie.push.netty.msg;

import java.io.Serializable;

/**
 * 消息基类
 * 必须实现序列，serialVersionUID 一定要有
 *
 * @author 徐飞
 * @version 2016/02/24 19:40
 */
public abstract class BaseMsg implements Serializable {
    private static final long serialVersionUID = 1L;
    private MsgType type;
    //必须唯一，否者会出现channel调用混乱
    private String account;

    //初始化客户端id
    public BaseMsg() {
        this.account = Constants.getAccount();
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public MsgType getType() {
        return type;
    }

    public void setType(MsgType type) {
        this.type = type;
    }
}
