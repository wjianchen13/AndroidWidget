package com.sunfusheng.coordinatorlayout.test;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.sunfusheng.coordinatorlayout.R;
import com.sunfusheng.coordinatorlayout.viewpager.ItemAdapter;

import java.util.ArrayList;
import java.util.List;

public class TestActivity extends AppCompatActivity {
    RecyclerView mRecyclerView;
    List<String> mDatas;
    private ItemAdapter mAdapter;

//    Toolbar mToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerView);
//        /**
//         * 设置 toolBar
//         */
//        mToolbar = (Toolbar) findViewById(R.id.toolbar);
//        // 该属性必须在setSupportActionBar之前 调用
//        mToolbar.setTitle("toolBar");
//        setSupportActionBar(mToolbar);


        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(layoutManager);
        DividerItemDecoration itemDecoration = new DividerItemDecoration(this,
                LinearLayoutManager.VERTICAL);
        mRecyclerView.addItemDecoration(itemDecoration);

        mDatas = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            String s = String.format("我是第%d个item", i);
            mDatas.add(s);
        }
        mAdapter = new ItemAdapter(this, mDatas);
        mRecyclerView.setAdapter(mAdapter);
    }

}
