package com.example.byang059.myapplication;

import android.database.Observable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.android.volley.RequestQueue;
import com.android.volley.VolleyError;
import com.android.volley.base.ResponseCallBack;
import com.android.volley.toolbox.Volley;
import com.example.byang059.myapplication.Request.BaiduRequest;
import com.example.byang059.myapplication.bean.Weather;


public class MainActivity extends AppCompatActivity {

    private RequestQueue requestQueue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        View viewById = findViewById(R.id.main_btn);
        viewById.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                BaiduRequest request = new BaiduRequest(new ResponseCallBack<Weather>(){
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Log.d("text",error.toString());
                        Toast.makeText(MainActivity.this,error.getMessage(),Toast.LENGTH_LONG).show();
                    }

                    @Override
                    public void onResponse(Weather response) {
                        Toast.makeText(MainActivity.this,response.toString(),Toast.LENGTH_LONG).show();
                        Log.d("text",response.toString());
                    }
                });

                requestQueue.add(request);
            }
        });

       requestQueue = Volley.newRequestQueue(this);



    }




}
