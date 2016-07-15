package com.yanyuanquan.android.git_mvp.ui.login;


import com.android.guider.util.L;
import com.yanyuanquan.android.automvp.annotation.Model;
import com.yanyuanquan.android.git_mvp.base.expand.BasePresenter;
import com.yanyuanquan.android.git_mvp.base.widget.LoadingSubscriber;
import com.yanyuanquan.android.git_mvp.mode.LoginModel;
import com.yanyuanquan.android.git_mvp.widget.LoginManager;
import com.yanyuanquan.android.git_mvp.widget.SP;
import com.yanyuanquan.model.entity.Account;

/**
 * Created by guider on 16/7/14.
 * Email guider@yeah.net
 * github https://github.com/guider
 */
@Model(LoginModel.class)
public class SplashPresenter extends BasePresenter<ActivitySpalsh, LoginModel, Object> {
    public void login(String userName, String passWord) {
        subscription = model.login(userName, passWord, new LoadingSubscriber<Account>(view, listener));
    }

    LoadingSubscriber.OnNextListener<Account> listener = new LoadingSubscriber.OnNextListener<Account>() {
        @Override
        public void onLoadSuccess(Account account) {
            LoginManager.save(account);
        }
    };
}

