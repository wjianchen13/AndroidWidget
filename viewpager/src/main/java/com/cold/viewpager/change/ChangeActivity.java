package com.cold.viewpager.change;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.view.View;

import com.cold.viewpager.R;
import com.cold.viewpager.normal.MainFragment;

import java.util.List;

public class ChangeActivity extends FragmentActivity {

    private ChangeFragment fragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change);
        fragment = ChangeFragment.newInstance("main");
        getSupportFragmentManager().beginTransaction().replace(R.id.fl_test, fragment).commit();
    }

}
