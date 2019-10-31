package com.cold.coordinatorlayout;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.cold.coordinatorlayout.base.BaseActivity;
import com.cold.coordinatorlayout.collapse.CollapseActivity;
import com.cold.coordinatorlayout.project.ProjectActivity;
import com.cold.coordinatorlayout.stickyviewpager.StickyActivity;
import com.cold.coordinatorlayout.test.TestActivity;
import com.cold.coordinatorlayout.userinfo.UserActivity;
import com.cold.coordinatorlayout.viewpager.ViewPagerParallaxSnap;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * 基础使用
     * @param
     * @return
     */
    public void onTest(View v) {
        Intent it1 = new Intent();
        it1.setClass(MainActivity.this, ViewPagerParallaxSnap.class);
        startActivity(it1);
    }

    /**
     * 基础使用
     * @param
     * @return
     */
    public void onTest1(View v) {
        Intent it1 = new Intent();
        it1.setClass(MainActivity.this, TestActivity.class);
        startActivity(it1);
    }

    /**
     * base behavior
     * @param
     * @return
     */
    public void onBaseBehavior(View v) {
        Intent it1 = new Intent();
        it1.setClass(MainActivity.this, com.cold.coordinatorlayout.basebehavior.BaseActivity.class);
        startActivity(it1);
    }

    /**
     * 粘性viewpager,使用的是系统提供的CollapsingToolbarLayout
     * @param
     * @return
     */
    public void onSticky(View v) {
        Intent it1 = new Intent();
        it1.setClass(MainActivity.this, StickyActivity.class);
        startActivity(it1);
    }

    /**
     * 基础测试
     * @param
     * @return
     */
    public void onBase(View v) {
        Intent it1 = new Intent();
        it1.setClass(MainActivity.this, BaseActivity.class);
        startActivity(it1);
    }

    /**
     * 基础测试
     * @param
     * @return
     */
    public void onProject(View v) {
        Intent it1 = new Intent();
        it1.setClass(MainActivity.this, ProjectActivity.class);
        startActivity(it1);
    }


    /**
     * 个人资料demo
     * @param
     * @return
     */
    public void onUser(View v) {
        Intent it1 = new Intent();
        it1.setClass(MainActivity.this, UserActivity.class);
        startActivity(it1);
    }

    /**
     * 通过CollapsingToolbarLayout实现
     * @param
     * @return
     */
    public void onCollapse(View v) {
        Intent it1 = new Intent();
        it1.setClass(MainActivity.this, CollapseActivity.class);
        startActivity(it1);
    }
}
