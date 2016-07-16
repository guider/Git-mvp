package com.yanyuanquan.android.git_mvp.ui.main;

import android.support.annotation.NonNull;

import com.yanyuanquan.android.automvp.annotation.Model;
import com.yanyuanquan.android.git_mvp.base.expand.BasePresenter;

/**
 * Created by guider on 16/7/14.
 * Email guider@yeah.net
 * github https://github.com/guider
 */
@Model(MainModel.class)
public class MainPresenter extends BasePresenter<ActivityMain, MainModel, Object> {

    @Override
    public void onPostCreate(@NonNull ActivityMain view) {
        super.onPostCreate(view);


    }
}
