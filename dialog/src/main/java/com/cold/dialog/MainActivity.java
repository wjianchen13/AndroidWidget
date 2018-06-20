package com.cold.dialog;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * 显示状态
     * @param
     * @return
     */
    public void onDialog(View v) {
        Intent it = new Intent();
        it.setClass(MainActivity.this, DialogActivity.class);
        startActivity(it);
    }
}
