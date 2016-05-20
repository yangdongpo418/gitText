package com.example.byang059.myapplication.Request;

import com.android.volley.base.BodyParam;
import com.android.volley.base.GsonJsonRequest;
import com.android.volley.base.ResponseCallBack;
import com.example.byang059.myapplication.bean.Weather;
import com.example.byang059.myapplication.bean.WeatherInfo;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by byang059 on 5/19/2016.
 */
public class BaiduRequest extends GsonJsonRequest<Weather> {
    public static class RequestParams extends BodyParam {
        public int id = 111;
        public String username = "张三";
        public String key = "abc";
        public String value = "bcd";
    }


    public BaiduRequest(ResponseCallBack listener){
        super(Method.GET, "http://10.0.2.2:8080/manager/volley.json", new RequestParams(), listener,true);
        mClass = Weather.class;
        addHeader("token","312312432142141241");
    }

}
