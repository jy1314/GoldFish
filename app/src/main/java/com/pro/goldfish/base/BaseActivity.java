package com.pro.goldfish.base;

import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import butterknife.ButterKnife;

/*
* @author Jerry
* create at 2019/4/27 下午8:41
* description:所有Activity的base类
*/
public abstract class BaseActivity extends AppCompatActivity {
    /*
     * @author: Jerry
     * @create at 2019/4/27 下午8:53
     * @Param:
     * @description: 用于获取布局id，子activity类必须重写此方法
     * @return:
     */
    protected abstract int getContentViewLayoutID();
    /*
     * @author: Jerry
     * @create at 2019/4/27 下午8:50
     * @Param:Bundle savedInstanceState
     * @description: 进行初始化工作，子activity类必须重写此方法
     * @return:
     */
    protected abstract void init(Bundle savedInstanceState);

    /*
     * @author: Jerry
     * @create at 2019/4/27 下午8:52
     * @Param: int layoutResID
     * @description: 初始化view，增加了ButterKnife绑定Activity步骤
     * @return:
     */
    @Override
    public void setContentView(@LayoutRes int layoutResID) {
        super.setContentView(layoutResID);
        ButterKnife.bind(this);
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(getContentViewLayoutID()!=0) {//布局id不为空
            setContentView(getContentViewLayoutID());//加载布局
            init(savedInstanceState);
        }

    }

    @Override
    protected void onResume() {
        super.onResume();
    }
    @Override
    protected void onPause() {
        super.onPause();
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

}
