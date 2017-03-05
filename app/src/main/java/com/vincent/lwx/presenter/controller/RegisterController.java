package com.vincent.lwx.presenter.controller;

import com.vincent.lwx.base.BaseController;

/**
 * description ：
 * project name：CoolApp
 * author : Vincent
 * creation date: 2017/3/5 18:53
 *
 * @version 1.0
 */

public interface RegisterController {

    interface IView extends BaseController.IView{

        /**
         * 注册成功
         */
        void registerSuccess();
    }

    interface IPresenter{

        /**
         * 登录的具体逻辑实现
         * @param phone
         * @param password
         */
        void register(String phone,String password);

    }

}
