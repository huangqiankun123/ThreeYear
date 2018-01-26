package com.qiankun.threeyear.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.WindowManager;
import android.widget.RelativeLayout;

import com.qiankun.threeyear.R;

/**
 * Created by xcy on 2018/1/25.
 */

public class LoginActivity extends AppCompatActivity {

    private View mView_bg;
    private View mView_two;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        mView_bg = findViewById(R.id.view_one);

        mView_two = findViewById(R.id.view_two);

        WindowManager manager = this.getWindowManager();
        DisplayMetrics outMetrics = new DisplayMetrics();
        manager.getDefaultDisplay().getMetrics(outMetrics);
        int width = outMetrics.widthPixels;



        int w = View.MeasureSpec.makeMeasureSpec(0,View.MeasureSpec.UNSPECIFIED);
        int h = View.MeasureSpec.makeMeasureSpec(0,View.MeasureSpec.UNSPECIFIED);
        mView_bg.measure(w,h);

    }

    @Override
    protected void onResume() {
        super.onResume();
        int width = mView_bg.getMeasuredWidth();
        int i = width / 100 * 66;

        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) mView_two.getLayoutParams();
        layoutParams.width = i;
        mView_two.setLayoutParams(layoutParams);
    }
}
