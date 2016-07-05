package com.yanyuanquan.android.git_mvp.base;

import android.os.Bundle;

import com.yanyuanquan.android.automvp.presenter.EzPresenter;
import com.yanyuanquan.android.automvp.view.EzActivity;

/**
 * Created by guider on 16/7/5.
 * Email guider@yeah.net
 * github https://github.com/guider
 */
public  abstract class BaseActivity<P extends EzPresenter> extends EzActivity<P> {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        init();
        initData();
        initView();
    }

    protected abstract void initView();

    protected abstract void init();

    protected abstract void initData();
}
