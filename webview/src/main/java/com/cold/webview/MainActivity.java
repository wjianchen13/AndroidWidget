package com.cold.webview;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.cold.webview.muti.MutiWebViewActivity;

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
     * webview 出错处理
     * @param
     * @return
     */
    public void testError(View v) {
        Intent it = new Intent();
        it.setClass(MainActivity.this, ErrorActivity.class);
        startActivity(it);
    }

    /**
     * webview mode
     * @param
     * @return
     */
    public void testMode(View v) {
        Intent it = new Intent();
        it.setClass(MainActivity.this, MixActivity.class);
        startActivity(it);
    }

    /**
     * webview 缓存
     * @param
     * @return
     */
    public void testCache(View v) {
        Intent it = new Intent();
        it.setClass(MainActivity.this, CacheActivity.class);
        startActivity(it);
    }

    /**
     * webview 获取页面title
     * @param
     * @return
     */
    public void testTitle(View v) {
        Intent it = new Intent();
        it.setClass(MainActivity.this, TitleActivity.class);
        startActivity(it);
    }

    /**
     * webview 重新加载页面
     * @param
     * @return
     */
    public void onReload(View v) {
        Intent it = new Intent();
        it.setClass(MainActivity.this, ReloadActivity.class);
        startActivity(it);
    }

    /**
     * webview 圆角
     * @param
     * @return
     */
    public void onCornor(View v) {
        Intent it = new Intent();
        it.setClass(MainActivity.this, CornorActivity.class);
        startActivity(it);
    }

    /**
     * webview 圆角
     * @param
     * @return
     */
    public void onCornor1(View v) {
        Intent it = new Intent();
        it.setClass(MainActivity.this, CornorActivity1.class);
        startActivity(it);
    }

    /**
     * webview 圆角
     * @param
     * @return
     */
    public void onCornor2(View v) {
        Intent it = new Intent();
        it.setClass(MainActivity.this, CornorActivity2.class);
        startActivity(it);
    }

    /**
     * webview 圆角
     * @param
     * @return
     */
    public void onCornor3(View v) {
        Intent it = new Intent();
        it.setClass(MainActivity.this, CornorActivity3.class);
        startActivity(it);
    }
    
    /**
     * ViewPager WebView嵌套
     * @param
     * @return
     */
    public void onMutiWebview(View v) {
        Intent it = new Intent();
        it.setClass(MainActivity.this, MutiWebViewActivity.class);
        startActivity(it);
    }
}
