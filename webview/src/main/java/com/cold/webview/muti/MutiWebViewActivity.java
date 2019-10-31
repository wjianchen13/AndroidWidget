package com.cold.webview.muti;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.cold.webview.Compat.CustomWebView;
import com.cold.webview.R;

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
public class MutiWebViewActivity extends AppCompatActivity {

    private CustomWebView rlytTest;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_muti_webview);

        MainFragment fragment = MainFragment.newInstance("main");
        getSupportFragmentManager().beginTransaction().replace(R.id.fl_test, fragment).commit();
    }

}
