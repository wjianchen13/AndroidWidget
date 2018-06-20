package com.sunfusheng.coordinatorlayout;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.sunfusheng.coordinatorlayout.test.TestActivity;
import com.sunfusheng.coordinatorlayout.viewpager.ViewPagerParallaxSnap;

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
}
