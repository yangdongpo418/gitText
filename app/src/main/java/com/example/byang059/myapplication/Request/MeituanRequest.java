package com.example.byang059.myapplication.Request;

import com.android.volley.base.BodyParam;
import com.android.volley.base.GsonJsonRequest;
import com.android.volley.base.ResponseCallBack;

/**
 * Created by byang059 on 5/20/2016.
 */
public class MeituanRequest extends GsonJsonRequest<String> {


    public MeituanRequest(int method, String url, BodyParam bodyParam, ResponseCallBack listener, boolean isAddPublicParam) throws IllegalAccessException {
        super(method, url, bodyParam, listener, isAddPublicParam);
    }
}
