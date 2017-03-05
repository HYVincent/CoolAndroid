package com.vincent.lwx.network;

import com.vincent.lwx.conf.Config;
import com.vincent.lwx.network.service.ApiService;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * description ：
 * project name：MyAppProject
 * author : Vincent
 * creation date: 2017/2/23 10:12
 *
 * @version 1.0
 */

public class RetrofitUtils {

    private static Retrofit retrofit;
    private static RetrofitUtils retrofitUtils;

    private RetrofitUtils(){
        if(retrofit == null){
            retrofit = new Retrofit.Builder()
                    .baseUrl(Config.SERVICE_API_ADDRESS)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
    }
    public static Retrofit getRetrofit(){
        if(retrofit == null){
            RetrofitUtils.getInstance();
        }
        return retrofit;
    }

    /**
     * 获取apiService对象
     * @return
     */
    public static ApiService getApiService(){
        if(retrofit == null){
            getRetrofit();
        }
        return retrofit.create(ApiService.class);
    }

    /**
     * 获取一个单例模式的RetrofitUtils对象
     * @return
     */
    public static RetrofitUtils getInstance(){
        if(retrofitUtils == null){
            synchronized (RetrofitUtils.class){
                if(retrofitUtils == null){
                    retrofitUtils = new RetrofitUtils();
                }
            }
        }
        return retrofitUtils;
    }



}
