package com.cold.webview;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * name: MainActivity
 * desc: webview 使用方法
 * author:
 * date: 2017-06-16 15:10
 * remark:
 * WebSettings
 * WebViewClient
 * WebChromeClient
 */
public class MainActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * 基础使用
     * @param
     * @return
     */
    public void testBase(View v) {
        Intent it = new Intent();
        it.setClass(MainActivity.this, BaseActivity.class);
        startActivity(it);
    }

    /**
     * webview滚动监听
     * @param
     * @return
     */
    public void testScroll(View v) {
        Intent it = new Intent();
        it.setClass(MainActivity.this, ScrollActivity.class);
        startActivity(it);
    }

    /**
     * webview滚动监听
     * @param
     * @return
     */
    public void testError(View v) {
        Intent it = new Intent();
        it.setClass(MainActivity.this, ErrorActivity.class);
        startActivity(it);
    }

}
