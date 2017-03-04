package com.vincent.lwx.network;

import com.vincent.lwx.conf.Config;
import com.vincent.lwx.network.service.ApiService;

import retrofit2.Retrofit;

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

    public RetrofitUtils(){
        if(retrofit == null){
            retrofit = new Retrofit.Builder()
                    .baseUrl(Config.SERVICE_API_ADDRESS)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
    }

    public static ApiService getRetrofit(){
        if(retrofit == null){
            retrofitUtils = new RetrofitUtils();
        }
        retrofit = new Retrofit.Builder()
                .baseUrl(Config.SERVICE_API_ADDRESS)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        ApiService apiService = retrofit.create(ApiService.class);
        return apiService;
    }

}
