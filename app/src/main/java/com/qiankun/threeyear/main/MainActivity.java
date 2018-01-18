package com.qiankun.threeyear.main;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.ashokvarma.bottomnavigation.BottomNavigationBar;
import com.ashokvarma.bottomnavigation.BottomNavigationItem;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.qiankun.threeyear.R;
import com.qiankun.threeyear.api.ApiService;
import com.qiankun.threeyear.api.HomeBean;
import com.qiankun.threeyear.api.LoginBean;
import com.qiankun.threeyear.base.BaseActivity;
import com.qiankun.threeyear.core.response.BaseResponse;
import com.qiankun.threeyear.core.retrofit.RetrofitHelper;
import com.qiankun.threeyear.core.rxjava.BaseObserver;
import com.qiankun.threeyear.core.rxjava.RxSchedulers;
import com.qiankun.threeyear.main.fragment.FourFragment;
import com.qiankun.threeyear.main.fragment.OneFragment;
import com.qiankun.threeyear.main.fragment.ThreeFragment;
import com.qiankun.threeyear.main.fragment.TwoFragment;
import com.qiankun.threeyear.wiget.dialog.IProgressDialog;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;

public class MainActivity extends BaseActivity implements BottomNavigationBar.OnTabSelectedListener {

    private FragmentManager mFm;
    private BottomNavigationBar bottomNavigationBar;
    private static final String SAVED_INDEX = "saved_index";
    private static String[] TAG_FRAGMENT = new String[]{"one", "two", "three", "four"};
    private Fragment oneFragment;
    private Fragment twoFragment;
    private Fragment threeFragment;
    private Fragment fourFragment;
    private int currentIndex = 0;    //当前显示的fragment的下标
    private ArrayList<Fragment> mFragments;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bottomNavigationBar = findViewById(R.id.bottom_navigation);

//        mFm = getSupportFragmentManager();
//        if (savedInstanceState != null) {
//            int index = savedInstanceState.getInt(SAVED_INDEX);
//            oneFragment = mFm.findFragmentByTag(TAG_FRAGMENT[0]);
//            twoFragment = mFm.findFragmentByTag(TAG_FRAGMENT[1]);
//            threeFragment = mFm.findFragmentByTag(TAG_FRAGMENT[2]);
//            fourFragment = mFm.findFragmentByTag(TAG_FRAGMENT[3]);
//        }

        initbottom();

    }

    private void initbottom() {
        //设置模式（MODE_DEFAULT:如果Item的个数<=3就会使用MODE_FIXED模式，否则使用MODE_SHIFTING模式。MODE_FIXED 是填充模式，未选中的Item会显示文字，没有移位动画。MODE_SHIFTING:
        //移位模式，未选中的Item不会显示文字，选中的会显示文字。在切换的时候会有一个像移位的动画）
        bottomNavigationBar.setMode(BottomNavigationBar.MODE_FIXED);
        //设置背景样式（ BACKGROUND_STYLE_STATIC 点击的时候没有水波纹效果，BACKGROUND_STYLE_RIPPLE 点击的时候有水波纹效果，如果设置的Mode为MODE_FIXED，将使用BACKGROUND_STYLE_STATIC 。如果Mode为MODE_SHIFTING将使用BACKGROUND_STYLE_RIPPLE。）
        bottomNavigationBar
                .setBackgroundStyle(BottomNavigationBar.BACKGROUND_STYLE_STATIC
                );

        // 添加Item,设置选中的Item,初始化
        bottomNavigationBar
                .addItem(new BottomNavigationItem(R.mipmap.ic_home, getString(R.string.nav_00_title)).setActiveColorResource(R.color.colorPrimary))
                .addItem(new BottomNavigationItem(R.mipmap.ic_view_headline, getString(R.string.nav_01_title)).setActiveColorResource(R.color.colorPrimary))
                .addItem(new BottomNavigationItem(R.mipmap.ic_live_tv, getString(R.string.nav_02_title)).setActiveColorResource(R.color.colorPrimary))
                .addItem(new BottomNavigationItem(R.mipmap.icon_find, getString(R.string.find)).setActiveColorResource(R.color.colorPrimary))
                .setFirstSelectedPosition(0)
                .initialise();

        mFragments = getFragments();
        //设置默认的Item
        setDefaultFragment();
        //监听实现的方法
        bottomNavigationBar.setTabSelectedListener(this);

    }

    /**
     * 设置默认的Item
     */
    private void setDefaultFragment() {
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction transaction = fm.beginTransaction();
        transaction.replace(R.id.fl_content, OneFragment.newInstance("one"));
        transaction.commit();
    }

    private ArrayList<Fragment> getFragments() {
        ArrayList<Fragment> fragments = new ArrayList<>();
        fragments.add(OneFragment.newInstance("one"));
        fragments.add(TwoFragment.newInstance("two"));
        fragments.add(ThreeFragment.newInstance("three"));
        fragments.add(FourFragment.newInstance("four"));
        return fragments;
    }


    @Override
    public void onTabSelected(int position) {
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        //当前的fragment
        Fragment from = fm.findFragmentById(R.id.fl_content);
        //点击即将跳转的fragment
        Fragment fragment = mFragments.get(position);
        if (mFragments != null) {
            if (position < mFragments.size()) {

                if (fragment.isAdded()) {
                    // 隐藏当前的fragment，显示下一个
                    ft.hide(from).show(fragment);
                } else {
                    // 隐藏当前的fragment，add下一个到Activity中
                    ft.hide(from).add(R.id.fl_content, fragment);
                    if (fragment.isHidden()) {
                        ft.show(fragment);
                    }
                }
                ft.commitAllowingStateLoss();
            }
        }
    }

    @Override
    public void onTabUnselected(int position) {
        //这儿也要操作隐藏，否则Fragment会重叠
        if (mFragments != null) {
            if (position < mFragments.size()) {
                FragmentManager fm = getSupportFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                Fragment fragment = mFragments.get(position);
                // 隐藏当前的fragment
                ft.hide(fragment);
                ft.commitAllowingStateLoss();
            }
        }

    }

    @Override
    public void onTabReselected(int position) {

    }


    @Override
    protected void onSaveInstanceState(Bundle outState) {
        outState.putInt(SAVED_INDEX, currentIndex);
        super.onSaveInstanceState(outState);
    }




}
