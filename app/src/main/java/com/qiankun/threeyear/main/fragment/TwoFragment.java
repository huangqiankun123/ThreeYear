package com.qiankun.threeyear.main.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.qiankun.threeyear.R;
import com.qiankun.threeyear.base.BaseFragment;

/**
 * Created by QKun on 2018/1/18.
 */

public class TwoFragment extends BaseFragment {

    public static final String ARGUMENT = "two";

    public static TwoFragment newInstance(String argument) {
        Bundle bundle = new Bundle();
        bundle.putString(ARGUMENT, argument);
        TwoFragment twoFragment = new TwoFragment();
        twoFragment.setArguments(bundle);
        return twoFragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = LayoutInflater.from(mContext).inflate(R.layout.fragment_two, container, false);
        return rootView;
    }
}
