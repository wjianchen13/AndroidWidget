package com.cold.viewpager;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.view.View;

import java.util.List;

public class ViewPagerActivity extends FragmentActivity {

    private MainFragment fragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_pager);
        fragment = MainFragment.newInstance("main");
        getSupportFragmentManager().beginTransaction().replace(R.id.fl_test, fragment).commit();
    }

    /**
     * 清除内容
     * @param
     * @return
     */
    public void onClear(View v) {
        List<Fragment> fragments = getSupportFragmentManager().getFragments();
        if(fragments != null) {
            for(int i = 0; i < fragments.size(); i ++) {
                if(fragments.get(i) instanceof MainFragment)
                    ((MainFragment)(fragments.get(i))).clearState();
            }
        }
    }

    /**
     * 改变内容
     * @param
     * @return
     */
    public void onChange(View v) {
        List<Fragment> fragments = getSupportFragmentManager().getFragments();
        if(fragments != null) {
            for(int i = 0; i < fragments.size(); i ++) {
                if(fragments.get(i) instanceof MainFragment)
                    ((MainFragment)(fragments.get(i))).loadingData("test");
            }
        }

    }

}
