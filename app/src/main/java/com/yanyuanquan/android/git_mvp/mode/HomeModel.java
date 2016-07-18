package com.yanyuanquan.android.git_mvp.mode;

import com.yanyuanquan.android.git_mvp.base.api.HttpManager;
import com.yanyuanquan.model.BaseModel;
import com.yanyuanquan.model.entity.Repository;

import java.util.List;

import retrofit2.http.HTTP;
import rx.Subscriber;
import rx.Subscription;

/**
 * Created by guider on 16/7/17.
 * Email guider@yeah.net
 * github https://github.com/guider
 */
public class HomeModel extends BaseModel {


    public Subscription getLanguageList(String language, String since, Subscriber<List<Repository>> subscriber) {
        return HttpManager.getLanguageList(language, since, subscriber);
    }
}
