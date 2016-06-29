package com.yanyuanquan.android.git_mvp.ui.login;

import android.os.Bundle;
import android.support.annotation.NonNull;

import com.yanyuanquan.android.automvp.annotation.Model;
import com.yanyuanquan.android.automvp.presenter.BasePresenter;
import com.yanyuanquan.model.api.LoginModel;

/**
 * Created by guider on 16/6/29.
 * Email guider@yeah.net
 * github https://github.com/guider
 */
@Model(LoginModel.class)
public class LoginPresenter extends BasePresenter<ActivityLogin, LoginModel> {

    @Override
    public void onCreate(@NonNull ActivityLogin view, Bundle savedState) {
        super.onCreate(view, savedState);
    }
}
