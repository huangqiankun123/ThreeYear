package com.qiankun.threeyear.core.rxjava;

import android.util.Log;

import com.qiankun.threeyear.core.exception.ServerException;
import com.qiankun.threeyear.core.response.BaseResponse;

import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by xcy on 2017/11/14.
 * 通常我们会在IO线程进行请求，在主线程进行回调
 */

public class RxSchedulers {

    public static <T> ObservableTransformer<BaseResponse<T>, T> compose() {
        return new ObservableTransformer<BaseResponse<T>, T>() {
            @Override
            public ObservableSource<T> apply(Observable<BaseResponse<T>> upstream) {
                return upstream.flatMap(new Function<BaseResponse<T>, ObservableSource<T>>() {
                    @Override
                    public ObservableSource<T> apply(BaseResponse<T> tBaseResponse) throws Exception {
                        if (tBaseResponse.isSuccess()) {
                            return createData(tBaseResponse.getRows());
                        } else {
                            return Observable.error(new ServerException(tBaseResponse.getCode(), tBaseResponse.getMsg()));
                        }

                    }
                }).subscribeOn(Schedulers.io())
                        .observeOn(AndroidSchedulers.mainThread());
            }
        };
    }

    private static <T> ObservableSource<T> createData(final T data) {
        return Observable.create(new ObservableOnSubscribe<T>() {
            @Override
            public void subscribe(ObservableEmitter<T> emitter) throws Exception {
                try {
                    Log.e("网络", "Activity _ onNext");
                    emitter.onNext(data);
                    emitter.onComplete();
                } catch (Exception e) {
                    Log.e("网络", "Activity _ onError");
                    emitter.onError(e);
                }
            }
        });
    }
}
