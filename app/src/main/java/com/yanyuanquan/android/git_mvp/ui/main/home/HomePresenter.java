package com.yanyuanquan.android.git_mvp.ui.main.home;

import android.support.annotation.NonNull;

import com.yanyuanquan.android.automvp.annotation.Model;
import com.yanyuanquan.android.automvp.presenter.EzPresenter;
import com.yanyuanquan.android.git_mvp.base.widget.LoadingSubscriber;
import com.yanyuanquan.android.git_mvp.mode.HomeModel;
import com.yanyuanquan.model.entity.Repository;

import java.util.Date;
import java.util.List;

import rx.Subscriber;

/**
 * Created by guider on 16/7/14.
 * Email guider@yeah.net
 * github https://github.com/guider
 */
public class HomePresenter extends BaseHomePresenter<HomeFragment, List<Repository>> {



    @Override
    public void onPostCreate(@NonNull HomeFragment view) {
        super.onPostCreate(view);
    }
}
