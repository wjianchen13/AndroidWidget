package com.cold.webview;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.RelativeLayout;
import android.widget.TextView;

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
public class BaseActivity extends AppCompatActivity {

    private RelativeLayout rlytTest;
    private WebView webView = null;
    private TextView tvText = null;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base);

        rlytTest = (RelativeLayout) findViewById(R.id.rlyt_webview);
        RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.MATCH_PARENT, RelativeLayout.LayoutParams.MATCH_PARENT);
        webView = new WebView(getApplicationContext());
        webView.setLayoutParams(params);
        rlytTest.addView(webView);
        tvText = (TextView) findViewById(R.id.tv_test);
        WebSettings settings = webView.getSettings();
        setWebViewSettings(settings);

        webView.setBackgroundColor(Color.parseColor("#00000000"));
        webView.setWebViewClient(new WebViewClient() {

            @Override
            public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
                if (webView != null)
                    webView.loadUrl(request.getUrl().toString());
                return true;
            }

            @Override
            public void onPageStarted(WebView view, String url, Bitmap favicon) {
                tvText.setText("开始加载了");
                super.onPageFinished(view, url);
            }
            @Override
            public void onReceivedError(WebView view, WebResourceRequest request, WebResourceError error) {
                super.onReceivedError(view, request, error);
                tvText.setText("结束错误");
            }

            //设置结束加载函数
            @Override
            public void onPageFinished(WebView view, String url) {
                tvText.setText("结束加载");
                rlytTest.setVisibility(View.VISIBLE);
                super.onPageFinished(view, url);
            }
        });
        webView.setWebChromeClient(new WebChromeClient() {
        });

        webView.setHorizontalScrollBarEnabled(true); // 水平不显示
        webView.setVerticalScrollBarEnabled(true); // 垂直不显示
        webView.setScrollBarStyle(View.SCROLLBARS_OUTSIDE_OVERLAY); // 滚动条在WebView内侧显示
        webView.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY); // 滚动条在WebView外侧显示

        webView.loadUrl("http://www.qq.com");
        webView.setInitialScale(80);
    }

    /**
     * 设置WebView属性
     * @param
     * @return
     */
    private void setWebViewSettings(WebSettings settings) {
//        settings.setCacheMode(true);
//        settings.setDefaultTextEncodingName("gbk");
//        settings.setAllowFileAccess(true); // 启用或禁止WebView访问文件数据
//        settings.setBlockNetworkImage(); // 是否显示网络图像
//        settings.setBuiltInZoomControls(true); // 设置是否支持缩放
//        settings.setDefaultFontSize(); // 设置默认的字体大小
//        settings.setFixedFontFamily(); // 设置固定使用的字体
//        settings.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NARROW_COLUMNS); // 设置布局方式
//        settings.setLightTouchEnabled(); // 设置用鼠标激活被选项
//        settings.setSupportZoom(true); // 设置是否支持变焦
//
//        settings.setUseWideViewPort(true);
//
//        settings.setSupportMultipleWindows(false);
//        settings.setLoadWithOverviewMode(true);
//
//        settings.setAppCacheEnabled(true);
//        settings.setDatabaseEnabled(true);
//        settings.setDomStorageEnabled(true);
//        settings.setJavaScriptEnabled(true); // 支持与Javascript交互
//        settings.setGeolocationEnabled(true);
//        settings.setAppCachePath(this.getDir("appcache", 0).getPath());

        settings.setUseWideViewPort(true);//设定支持viewport
        settings.setLoadWithOverviewMode(true);   //自适应屏幕
        settings.setBuiltInZoomControls(true);
//        settings.setDisplayZoomControls(false);
        settings.setTextZoom(150); // 设置字体大小
        settings.setSupportZoom(true);//设定支持缩放
    }

}
