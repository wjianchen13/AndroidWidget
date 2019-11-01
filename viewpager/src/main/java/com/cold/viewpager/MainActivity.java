package com.cold.viewpager;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;

import com.cold.viewpager.change.ChangeActivity;
import com.cold.viewpager.normal.ViewPagerActivity;

public class MainActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * 清除内容
     * @param
     * @return
     */
    public void onNormal(View v) {
        startActivity(new Intent(MainActivity.this, ViewPagerActivity.class));
    }

    /**
     * 改变内容
     * @param
     * @return
     */
    public void onChange(View v) {
        startActivity(new Intent(MainActivity.this, ChangeActivity.class));
    }

}
