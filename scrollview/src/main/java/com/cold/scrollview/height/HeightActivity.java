package com.cold.scrollview.height;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ScrollView;

import com.cold.scrollview.R;

public class HeightActivity extends Activity {

    private ScrollView mScrollView;
    private LinearLayout llytFrame;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_height);
        mScrollView = (ScrollView)findViewById(R.id.scrollview);
        llytFrame = (LinearLayout) findViewById(R.id.llyt_frame);
        llytFrame.setMinimumHeight(2500);
    }

    /**
     * 基础使用
     * @param
     * @return
     */
    public void onHeight(View v) {
        int height1 = mScrollView.getChildAt(0).getBottom();
        int height2 = mScrollView.getChildAt(0).getBottom();
        int c = 0;
    }
}
