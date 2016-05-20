package com.example.byang059.myapplication.base;

import com.android.volley.base.BodyParam;
import com.android.volley.base.GsonJsonRequest;
import com.android.volley.base.ResponseCallBack;
import com.example.byang059.myapplication.Request.BaiduRequest;

/**
 * Created by byang059 on 5/20/2016.
 */
public class BaseRequest<T> extends GsonJsonRequest<T> {
    public BaseRequest(BodyParam bodyParam, ResponseCallBack<T> listener) throws IllegalAccessException {
        this(Method.GET,"",bodyParam,listener,false);
    }

    private BaseRequest(int method, String url, BodyParam bodyParam, ResponseCallBack listener, boolean isAddPublicParam) throws IllegalAccessException {
        super(method, url, bodyParam, listener, isAddPublicParam);
    }
}
