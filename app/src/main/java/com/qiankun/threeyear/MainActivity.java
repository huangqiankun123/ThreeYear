package com.qiankun.threeyear;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.qiankun.threeyear.api.ApiService;
import com.qiankun.threeyear.api.HomeBean;
import com.qiankun.threeyear.api.LoginBean;
import com.qiankun.threeyear.base.BaseActivity;
import com.qiankun.threeyear.core.response.BaseResponse;
import com.qiankun.threeyear.core.retrofit.RetrofitHelper;
import com.qiankun.threeyear.core.rxjava.BaseObserver;
import com.qiankun.threeyear.core.rxjava.RxSchedulers;
import com.qiankun.threeyear.wiget.dialog.IProgressDialog;

import java.util.HashMap;
import java.util.Map;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView text = findViewById(R.id.text);
        text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                login();
            }
        });
    }

    private void login() {
        Map<String, Object> param = new HashMap<>();
        param.put("username", "13191614");
        param.put("password", "123456");
        IProgressDialog progressDialog = new IProgressDialog().init(mContext).setDialogMsg(R.string.user_login);
        RetrofitHelper.createApi(ApiService.class).loginToApp(param)
                .compose(RxSchedulers.<BaseResponse<LoginBean>>compose())
                .doOnNext(new Consumer<BaseResponse<LoginBean>>() {//doOnNext 允许我们在每次输出一个元素之前做一些额外的事情 去保存/缓存网络结果
                    @Override
                    public void accept(BaseResponse<LoginBean> loginBeanBaseResponse) throws Exception {
                        //缓存起来
//                        String token = loginBeanBaseResponse.getRows().getToken();
                    }
                }).observeOn(Schedulers.io())
                .flatMap(new Function<BaseResponse<LoginBean>, ObservableSource<BaseResponse<HomeBean>>>() {
                    @Override
                    public ObservableSource<BaseResponse<HomeBean>> apply(BaseResponse<LoginBean> loginBeanBaseResponse) throws Exception {
                        Map<String, Object> param = new HashMap<>();
                        param.put("token", loginBeanBaseResponse.getRows().getToken());
                        param.put("studentid", loginBeanBaseResponse.getRows().getStudent().getStudentid());
                        return RetrofitHelper.createApi(ApiService.class).getHome(param);
                    }
                })
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new BaseObserver<HomeBean>(progressDialog) {
                    @Override
                    protected void onSuccess(HomeBean homeBean) {
                        homeBean.getSocial().getContent();
                        LogUtils.i(homeBean.getSocial().getContent());
                    }
                });

    }
}
