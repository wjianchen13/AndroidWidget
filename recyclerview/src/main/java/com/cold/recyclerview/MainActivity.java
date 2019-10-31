package com.cold.recyclerview;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ScrollView;

import com.cold.recyclerview.add.AddActivity;
import com.cold.recyclerview.base.BaseActivity;
import com.cold.recyclerview.fall.FallActivity;
import com.cold.recyclerview.header.HeaderActivity;
import com.cold.recyclerview.refresh.RefreshActivity;
import com.cold.recyclerview.span.SpanActivity;
import com.cold.recyclerview.visiblestate.StateActivity;


public class MainActivity extends Activity {

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
    public void onBase(View v) {
        Intent it1 = new Intent();
        it1.setClass(MainActivity.this, BaseActivity.class);
        startActivity(it1);
    }

    /**
     * 富文本
     * @param
     * @return
     */
    public void onSpan(View v) {
        Intent it1 = new Intent();
        it1.setClass(MainActivity.this, SpanActivity.class);
        startActivity(it1);
    }

    /**
     * 添加头部
     * @param
     * @return
     */
    public void onHeader(View v) {
        Intent it = new Intent();
        it.setClass(MainActivity.this, HeaderActivity.class);
        startActivity(it);
    }

    /**
     * 显示状态
     * @param
     * @return
     */
    public void onState(View v) {
        Intent it = new Intent();
        it.setClass(MainActivity.this, StateActivity.class);
        startActivity(it);
    }

    /**
     * 滑动到底部自动更新
     * @param
     * @return
     */
    public void onFresh(View v) {
        Intent it = new Intent();
        it.setClass(MainActivity.this, RefreshActivity.class);
        startActivity(it);
    }

    /**
     * 添加头部底部
     * @param
     * @return
     */
    public void onAdd(View v) {
        Intent it = new Intent();
        it.setClass(MainActivity.this, AddActivity.class);
        startActivity(it);
    }

    /**
     * 添加头部底部
     * @param
     * @return
     */
    public void onFall(View v) {
        Intent it = new Intent();
        it.setClass(MainActivity.this, FallActivity.class);
        startActivity(it);
    }

    /**
     * 添加头部底部
     * @param
     * @return
     */
    public void onProjectFall(View v) {
        Intent it = new Intent();
        it.setClass(MainActivity.this, FallActivity.class);
        startActivity(it);
    }

}
