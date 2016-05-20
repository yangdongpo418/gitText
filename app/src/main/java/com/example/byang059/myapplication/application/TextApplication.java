package com.example.byang059.myapplication.application;

import android.app.Application;
import android.content.Context;

/**
 * Created by byang059 on 5/20/2016.
 */
public class TextApplication extends Application {
    public static Context mContext;
    @Override
    public void onCreate() {
        super.onCreate();
        this.mContext = this;
    }
}
