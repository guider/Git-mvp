package com.yanyuanquan.android.git_mvp.mode;

import com.android.guider.util.Base64;
import com.yanyuanquan.android.git_mvp.base.BaseModel;
import com.yanyuanquan.android.git_mvp.base.api.ApiParamas;
import com.yanyuanquan.android.git_mvp.base.api.ApiService;
import com.yanyuanquan.android.git_mvp.base.api.HttpManager;
import com.yanyuanquan.android.git_mvp.base.api.RetrofitManager;
import com.yanyuanquan.android.git_mvp.base.widget.LoadingSubscriber;
import com.yanyuanquan.model.api.Token;
import com.yanyuanquan.model.entity.Account;

import java.util.ArrayList;

import rx.Subscription;

/**
 * Created by guider on 16/7/14.
 * Email guider@yeah.net
 * github https://github.com/guider
 */
public class LoginModel extends BaseModel {
    public Subscription login(String userName, String passWord, LoadingSubscriber<Account> subscriber) {
        return HttpManager.login(new Token(RetrofitManager.Client_Secret, "admin script", "public_repo"), "Basic " + Base64.getBase64(userName + ":" + passWord), subscriber);
    }
}
