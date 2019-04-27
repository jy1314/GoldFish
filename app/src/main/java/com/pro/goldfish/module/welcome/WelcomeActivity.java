package com.pro.goldfish.module.welcome;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.content.ContextCompat;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.pro.goldfish.R;
import com.pro.goldfish.base.BaseActivity;
import com.pro.goldfish.module.home.HomeActivity;

import butterknife.BindView;
import butterknife.OnClick;

public class WelcomeActivity extends BaseActivity {
    @BindView(R.id.welcome_pic)
    ImageView mPic;//进入图片
    @BindView(R.id.jump_text)
    TextView mJump;//跳过
    @BindView(R.id.welcome_default_pic)
    ImageView mDefultPic;//默认图片

    @Override
    protected int getContentViewLayoutID() {
        return R.layout.activity_welcome;
    }
    /*
     * @author: Jerry
     * @create at 2019/4/27 下午9:25
     * @Param:
     * @description: 初始化，首先显示img_default_welcome1，2秒后显示img_default_welcome2并显示跳过按钮
     * @return:
     */
    @Override
    protected void init(Bundle savedInstanceState) {
        mJump.setVisibility(View.GONE);
        mDefultPic.setImageDrawable(ContextCompat.getDrawable(this,R.drawable.img_default_welcome1));
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {//延时2s切换下一张图片，并显示跳过按钮
                mDefultPic.setVisibility(View.GONE);
                mJump.setVisibility(View.VISIBLE);
            }
        }, 2000);
        mPic.setImageDrawable(ContextCompat.getDrawable(this,R.drawable.img_default_welcome2));
    }
    /**
     * 跳转到主页面
     */
    private void toMainActivity() {
        Intent intent = new Intent(this, HomeActivity.class);
        startActivity(intent);
        finish();
    }
    @OnClick(R.id.jump_text)
    public void onClick() {
        toMainActivity();
    }


}
