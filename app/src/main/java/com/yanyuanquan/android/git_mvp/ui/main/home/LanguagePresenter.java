package com.yanyuanquan.android.git_mvp.ui.main.home;

import android.support.annotation.NonNull;

import com.yanyuanquan.android.automvp.annotation.Model;
import com.yanyuanquan.android.automvp.presenter.EzPresenter;
import com.yanyuanquan.android.git_mvp.base.expand.BasePresenter;
import com.yanyuanquan.android.git_mvp.base.widget.LoadingSubscriber;
import com.yanyuanquan.android.git_mvp.mode.HomeModel;
import com.yanyuanquan.model.entity.Repository;

import java.util.List;

/**
 * Created by guider on 16/7/18.
 * Email guider@yeah.net
 * github https://github.com/guider
 */
@Model(HomeModel.class)
public class LanguagePresenter extends BasePresenter<LanguageFragment, HomeModel, List<Repository>> {

    @Override
    public void onPostCreate(@NonNull LanguageFragment view) {
        super.onPostCreate(view);
        view.getArguments().getString(LanguageFragment.class.getName());
        subscription = model.getLanguageList("java", "daily", new LoadingSubscriber<List<Repository>>(view.getActivity(), mData, listener));
    }
    private LoadingSubscriber.OnNextListener<List<Repository>> listener = new LoadingSubscriber.OnNextListener<List<Repository>>() {
        @Override
        public void onLoadSuccess(List<Repository> repositories) {
            view.getAdapter().setData(repositories);
        }
    };
}
