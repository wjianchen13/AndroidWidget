package com.cold.base;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.cold.base.test.TestActivity;

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
        it1.setClass(MainActivity.this, TestActivity.class);
        startActivity(it1);
    }

}
