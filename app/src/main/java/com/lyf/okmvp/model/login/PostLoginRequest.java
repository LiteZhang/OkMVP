package com.lyf.okmvp.model.login;


import android.support.v4.util.ArrayMap;

import com.lyf.okmvp.http.HttpUrlConst;
import com.lyf.okmvp.http.HttpUtils;

import framework.bean.BaseBean;
import framework.net.response.Callback;
import framework.net.response.Response;


/**
 * @Author Lyf
 * @CreateTime 2018/2/5
 * @Description
 **/
public class PostLoginRequest {

    // login
    public static void PostLogin(final ArrayMap<String, Object> params, final Callback<BaseBean> responseCallback) {


        HttpUtils.getInstance().doPost(HttpUrlConst.POST_LOGIN_REQUEST, params, new Callback<BaseBean>() {
            @Override
            public void onFailure(int errorCode, String errorMsg, Response<BaseBean> response) {

            }

            @Override
            public void onResponse(BaseBean bean, Response<BaseBean> response) {

            }
        });

    }

    // cancel login
    public static void cancelLogin(){
        HttpUtils.getInstance().cancelRequestWithTag(HttpUrlConst.POST_LOGIN_REQUEST);
    }

}
