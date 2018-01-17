package com.qiankun.threeyear;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.blankj.utilcode.util.ToastUtils;
import com.qiankun.threeyear.api.ApiService;
import com.qiankun.threeyear.api.LoginBean;
import com.qiankun.threeyear.core.retrofit.RetrofitHelper;
import com.qiankun.threeyear.core.rxjava.BaseObserver;
import com.qiankun.threeyear.core.rxjava.RxSchedulers;

import java.util.HashMap;
import java.util.Map;

import io.reactivex.Observable;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ToastUtils.showLong("三年了");
        Map<String, Object> param = new HashMap<>();
        param.put("username", "13191614");
        param.put("password", "123456");

        Observable observable = RetrofitHelper.createApi(ApiService.class).loginToApp(param);

        observable.compose(RxSchedulers.<LoginBean>compose())
                .subscribe(new BaseObserver<LoginBean>() {
                    @Override
                    protected void onSuccess(LoginBean loginBean) {
                        ToastUtils.showShort(loginBean.getToken());
                    }

                });
    }
}
