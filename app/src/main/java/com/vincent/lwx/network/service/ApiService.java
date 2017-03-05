package com.vincent.lwx.network.service;

import com.vincent.lwx.conf.Result;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

/**
 * description ：
 * project name：CoolApp
 * author : Vincent
 * creation date: 2017/3/4 23:06
 *
 * @version 1.0
 */

public interface ApiService {
    /*个人信息模块*/
    /**
     * 用户注册
     * @param phone
     * @param password
     * @return
     */
    @POST("register")
    Call<Result> register(@Query("phone")String phone,@Query("password")String password);

    /**
     * 用户登录
     * @param phone
     * @param login
     * @return
     */
    @POST("login")
    Call<Result> login(@Query("phone")String phone,@Query("password")String login);

    /**
     * 修改用户个人资料
     * @param phone
     * @param sex
     * @param birthday
     * @param nickname
     * @param live_status
     * @return
     */
    @POST("updateUserInfo")
    Call<Result> updateUserInfo(@Query("phone")String phone,@Query("sex")String sex,@Query("birthday")String birthday,
                                @Query("nickname")String nickname,@Query("live_status")String live_status);

    /*日记模块*/
    /**
     * 添加日记
     * @param user_id
     * @param diaryTitle
     * @param diaryContent
     * @return
     */
    @POST("insertDiary")
    Call<Result> insertDiary(@Query("user_id")String user_id,@Query("diaryTitle")String diaryTitle,@Query("diaryContent")String diaryContent);

    /**
     * 删除用户的所有日记
     * @param user_id
     * @return
     */
    @POST("deleteUserAllDiary")
    Call<Result> deleteUserAllDiary(@Query("user_id")String user_id);

    /**
     * 删除用户的某条日记记录
     * @param user_id
     * @param diaryTitle
     * @return
     */
    @POST("deleteOneDiary")
    Call<Result> deleteOneDiary(@Query("user_id")String user_id,@Query("diaryTitle")String diaryTitle);

    /**
     * 获取用户所有的日记
     * @param user_id
     * @return
     */
    @GET("getUserAllDiary")
    Call<Result> getUserAllDiary(@Query("user_id")String user_id);


}
