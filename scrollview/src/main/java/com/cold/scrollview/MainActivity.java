package com.cold.scrollview;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.cold.scrollview.height.HeightActivity;

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
    public void onHeight(View v) {
        Intent it1 = new Intent();
        it1.setClass(MainActivity.this, HeightActivity.class);
        startActivity(it1);
    }
}
