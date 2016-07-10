package com.yanyuanquan.android.git_mvp.ui.login;

import com.yanyuanquan.android.automvp.annotation.Presenter;
import com.yanyuanquan.android.git_mvp.R;
import com.yanyuanquan.android.git_mvp.base.BaseActivity;

/**
 * Created by guider on 16/6/29.
 * Email guider@yeah.net
 * github https://github.com/guider
 */
@Presenter(LoginPresenter.class)
public class ActivityLogin  extends BaseActivity<LoginPresenter> {



    protected int getLayout() {
        return R.layout.activity_login;
    }

    @Override
    protected void initView() {

    }

    @Override
    protected void init() {

    }

    @Override
    protected void initData() {

    }
}
