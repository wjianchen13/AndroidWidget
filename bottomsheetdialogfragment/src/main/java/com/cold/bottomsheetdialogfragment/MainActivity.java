package com.cold.bottomsheetdialogfragment;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import com.cold.bottomsheetdialogfragment.comment.CommentFragment;

public class MainActivity extends AppCompatActivity {

    private Button btn_comment;
    private Button btn_comment1;
    private LinearLayout ll_bottom;
    private CommentFragment bottomSheetFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comment);
        btn_comment = (Button) findViewById(R.id.btn_comment);
        btn_comment1 = (Button) findViewById(R.id.btn_comment1);
        ll_bottom = (LinearLayout) findViewById(R.id.ll_bottom);
        btn_comment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(bottomSheetFragment == null)
                    bottomSheetFragment = CommentFragment.getInstance(ll_bottom.getWidth(), ll_bottom.getHeight());
                bottomSheetFragment.show(getSupportFragmentManager(), CommentFragment.class.getSimpleName());
            }
        });
        btn_comment1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(bottomSheetFragment == null) {
                    return ;
                }
                bottomSheetFragment.close(true);
            }
        });
    }
}
