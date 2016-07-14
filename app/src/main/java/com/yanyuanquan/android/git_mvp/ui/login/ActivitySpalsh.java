package com.yanyuanquan.android.git_mvp.ui.login;

import android.os.Bundle;
import android.widget.EditText;

import com.android.guider.util.TextVerify;
import com.yanyuanquan.android.automvp.annotation.Presenter;
import com.yanyuanquan.android.git_mvp.R;
import com.yanyuanquan.android.git_mvp.base.BaseActivity;

import org.w3c.dom.Text;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by guider on 16/7/14.
 * Email guider@yeah.net
 * github https://github.com/guider
 */
@Presenter(SplashPresenter.class)
public class ActivitySpalsh extends BaseActivity<SplashPresenter> {

    @Bind(R.id.username)
    EditText username;
    @Bind(R.id.password)
    EditText password;

    @Override
    protected void initView() {
        App.getApp.postDelay(,1000);
    }

    @Override
    protected void initData() {

    }

    @Override
    protected void init() {

    }

    @Override
    protected int getLayout() {
        return R.layout.activity_spalsh;
    }

    @OnClick(R.id.login)
    public void onClick() {
        String userName,passWord;
        if (!TextVerify.isUserName(userName = username.getText().toString().trim())){
            showTopToast("请输入正确的用户名");
            return;
        }
        if (!TextVerify.isPassWord(passWord = password.getText().toString().trim())){
            showTopToast("请输入正确的密码");
            return;
        }
        presenter.login(userName,passWord);


    }
}
