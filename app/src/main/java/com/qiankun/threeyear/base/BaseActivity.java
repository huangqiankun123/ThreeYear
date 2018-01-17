package com.qiankun.threeyear.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.blankj.utilcode.util.LogUtils;

/**
 * Created by xcy on 2018/1/16.
 */

public class BaseActivity extends AppCompatActivity {

    protected BaseActivity mContext;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mContext = this;
    }

    public boolean isSaveInstanceState = false;
    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        isSaveInstanceState = true;
        LogUtils.i("Activity", "onSaveInstanceState");
    }

    //    private  FragmentManager fragmentManager;
//
//    //--------------------------Fragment相关--------------------------//
//    /**
//     * 获取Fragment管理器
//     *
//     * @return
//     */
//    public FragmentManager getBaseFragmentManager() {
//        if (fragmentManager == null) {
//            fragmentManager = getSupportFragmentManager();
//        }
//        return fragmentManager;
//    }
//
//    /**
//     * 获取Fragment事务管理
//     *
//     * @return
//     */
//    public FragmentTransaction getFragmentTransaction() {
//        return getBaseFragmentManager().beginTransaction();
//    }
//
//    /**
//     * 替换一个Fragment
//     *
//     * @param res
//     * @param fragment
//     */
//    public void replaceFragment(int res, BaseFragment fragment) {
//        replaceFragment(res, fragment, false);
//    }
//
//    /**
//     * 替换一个Fragment并设置是否加入回退栈
//     *
//     * @param res
//     * @param fragment
//     * @param isAddToBackStack
//     */
//    public void replaceFragment(int res, BaseFragment fragment, boolean isAddToBackStack) {
//        FragmentTransaction fragmentTransaction = getFragmentTransaction();
//        fragmentTransaction.replace(res, fragment);
//        if (isAddToBackStack) {
//            fragmentTransaction.addToBackStack(null);
//        }
//        fragmentTransaction.commit();
//
//    }
//
//    /**
//     * 添加一个Fragment
//     *
//     * @param res
//     * @param fragment
//     */
//    public void addFragment(int res, Fragment fragment) {
//        FragmentTransaction fragmentTransaction = getFragmentTransaction();
//        fragmentTransaction.add(res, fragment);
//        fragmentTransaction.commit();
//    }
//    public void addFragment(int res, Fragment fragment,String tag) {
//        FragmentTransaction fragmentTransaction = getFragmentTransaction();
//        fragmentTransaction.add(res, fragment,tag);
//        fragmentTransaction.commit();
//    }
//
//    /**
//     * 移除一个Fragment
//     *
//     * @param fragment
//     */
//    public void removeFragment(Fragment fragment) {
//        FragmentTransaction fragmentTransaction = getFragmentTransaction();
//        fragmentTransaction.remove(fragment);
//        fragmentTransaction.commit();
//    }
//
//    /**
//     * 显示一个Fragment
//     *
//     * @param fragment
//     */
//    public void showFragment(Fragment fragment) {
//        Logger.e("状态显示");
//        if (fragment.isHidden()) {
//            com.orhanobut.logger.Logger.e("恢复状态Fragment");
//            FragmentTransaction fragmentTransaction = getFragmentTransaction();
//            fragmentTransaction.show(fragment);
//            fragmentTransaction.commit();
//        }
//    }
//
//    /**
//     * 隐藏一个Fragment
//     *
//     * @param fragment
//     */
//    public void hideFragment(Fragment fragment) {
//        if (!fragment.isHidden()) {
//            FragmentTransaction fragmentTransaction = getFragmentTransaction();
//            fragmentTransaction.hide(fragment);
//            fragmentTransaction.commit();
//        }
//    }
//
//    //--------------------------Fragment相关end--------------------------//

}
