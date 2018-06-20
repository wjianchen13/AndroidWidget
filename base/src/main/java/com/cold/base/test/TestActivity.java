package com.cold.base.test;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.cold.base.R;

public class TestActivity extends Activity {

    private LinearLayout llytFrame;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        llytFrame = (LinearLayout) findViewById(R.id.llyt_frame);
        llytFrame.post(new Runnable() {
            @Override
            public void run() {
                getParams();
            }
        });
    }


    /**
     * 基础使用
     * @param
     * @return
     */
    public void onBase(View v) {
        int height = llytFrame.getHeight();
        int width = llytFrame.getWidth();
        int c = 0;
    }

    private void getParams() {
        int height = llytFrame.getHeight();
        int width = llytFrame.getWidth();
        int c = 0;
    }

}
