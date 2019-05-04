package com.pro.goldfish.module.test;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

import com.pro.goldfish.R;
import com.pro.goldfish.base.BaseActivity;
import com.pro.goldfish.module.weather.WeatherActivity;

import butterknife.BindView;
import butterknife.OnClick;

public class TestActivity extends BaseActivity {
    @BindView(R.id.button1)
    Button button1;
    @BindView(R.id.button2)
    Button button2;
    @BindView(R.id.button3)
    Button button3;
    @BindView(R.id.button4)
    Button button4;
    @BindView(R.id.button5)
    Button button5;

    @Override
    protected int getContentViewLayoutID() {
        return R.layout.activity_test;
    }

    @Override
    protected void init(Bundle savedInstanceState) {

    }

    @OnClick(R.id.button1)
    public void setButton1(){
        Intent intent = new Intent(TestActivity.this,WeatherActivity.class);
        startActivity(intent);
    }
    @OnClick(R.id.button2)
    public void setButton2(){

    }

}
