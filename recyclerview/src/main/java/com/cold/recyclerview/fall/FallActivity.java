package com.cold.recyclerview.fall;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.cold.recyclerview.R;
import com.cold.recyclerview.add.AddAdapter;
import com.cold.recyclerview.add.AddBean;
import com.cold.recyclerview.add.AddRefreshLayout;
import com.cold.recyclerview.add.AddSpace;
import com.cold.recyclerview.fall.adapter.RecyclerViewAdapter;
import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.scwang.smartrefresh.layout.listener.OnLoadmoreListener;

import java.util.ArrayList;
import java.util.List;

public class FallActivity extends AppCompatActivity implements RecyclerViewAdapter.onRecyclerViewItemClickListener {

    private RecyclerViewAdapter recyclerViewAdapter;

    //定义一个图片数组
    private int[] image = {R.drawable.akali, R.drawable.alafu, R.drawable.buxiang, R.drawable.buxiang2, R.drawable.delaiwen, R.drawable.fengnv,
            R.drawable.guanghui, R.drawable.hanbing, R.drawable.huli, R.drawable.jiakesi, R.drawable.jiansheng,
            R.drawable.jiaoji, R.drawable.jihe, R.drawable.kasading, R.drawable.manwang, R.drawable.pansen,
            R.drawable.rizi, R.drawable.tailong, R.drawable.vn, R.drawable.xiaopao,R.drawable.akali, R.drawable.alafu, R.drawable.buxiang, R.drawable.buxiang2, R.drawable.delaiwen, R.drawable.fengnv,
            R.drawable.guanghui, R.drawable.hanbing, R.drawable.huli, R.drawable.jiakesi, R.drawable.jiansheng,
            R.drawable.jiaoji, R.drawable.jihe, R.drawable.kasading, R.drawable.manwang, R.drawable.pansen,
            R.drawable.rizi, R.drawable.tailong, R.drawable.vn, R.drawable.xiaopao};
    private RecyclerView recyclerview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fall);
        initView();
    }

    public void onTest(View v) {
        recyclerViewAdapter.notifyDataSetChanged();
    }

    private void initView() {
        recyclerview = (RecyclerView) findViewById(R.id.recyclerview);
        //新建一个RecyclerView的适配器，并传入数据
        recyclerViewAdapter = new RecyclerViewAdapter(this, image);
        //将适配器设置给recyclerview控件
        recyclerview.setAdapter(recyclerViewAdapter);
        //新建一个StaggeredGridLayoutManager布局管理器，设置参数：1.显示的列数   2.显示布局的方向（水平或垂直）
        StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL);
        //将布局管理器设置给recyclerveiw控件
        recyclerview.setLayoutManager(staggeredGridLayoutManager);
        //给适配器添加我们暴露的监听方法
        recyclerViewAdapter.setOnRecyclerViewItemClickListener(this);

    }


    //实现我们的监听接口里的方法，在这里获得数据，对数据进行操作
    @Override
    public void onItemClick(View view, int img) {
        //创建一个intent，指明跳转目标类
        Intent intent = new Intent(this, ImageDetail.class);
        //拿到数据传给intent
        intent.putExtra("image", img);
        //启动Activity
        startActivity(intent);
    }
}
