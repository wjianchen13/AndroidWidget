package com.cold.viewpager;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * name: TestFragment0
 * desc:
 * author:
 * date: 2018-03-27 11:00
 * remark:
 */
public class TestFragment0 extends Fragment {

	protected View view;

	private String test;

	private TextView tvTest;

	public static TestFragment0 newInstance(String test) {
		Bundle args = new Bundle();
		TestFragment0 fragment = new TestFragment0();
		args.putString("test", test);
		fragment.setArguments(args);
		return fragment;
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		Bundle bundle = getArguments();
		if (bundle != null) {
			test = bundle.getString("test");
		}
		super.onCreate(savedInstanceState);
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
		view = inflater.inflate(R.layout.fragment_test, null);
		initView(view);
		return view;
	}

	@Override
	public void onResume() {
		super.onResume();
	}

	/**
	 * 清除界面状态
	 * @param
	 * @return
	 */
	public void clearState() {
		if(tvTest != null) {
			tvTest.setText("clear");
		}
	}

	/**
	 * 重新设置数据
	 * @param
	 * @return
	 */
	public void loadingData() {

	}

	/**
	 * 初始化界面
	 * @param
	 * @return
	 */
	private void initView(View view) {
		if(view != null) {
			tvTest = view.findViewById(R.id.tv_test);
			tvTest.setText(test);
		}
	}

}
