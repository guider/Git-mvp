package com.yanyuanquan.android.git_mvp.ui.main.home;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.android.guider.util.L;
import com.yanyuanquan.android.automvp.annotation.Presenter;
import com.yanyuanquan.android.automvp.expland.EzListFragment;
import com.yanyuanquan.android.automvp.expland.adapter.EzHolder;
import com.yanyuanquan.android.git_mvp.R;
import com.yanyuanquan.model.entity.Repository;

/**
 * Created by guider on 16/7/18.
 * Email guider@yeah.net
 * github https://github.com/guider
 */
@Presenter(LanguagePresenter.class)
public class LanguageFragment extends EzListFragment<LanguagePresenter, Repository> {


    public static Fragment getInstance(Context context, String title) {
        Bundle bundle = new Bundle();
        bundle.putString(LanguageFragment.class.getName(), title);
        return instantiate(context, LanguageFragment.class.getName(),bundle);
    }
    @Override
    public void setItemData(Repository repository, EzHolder holder, Context context) {

    }

    @Override
    public void initView() {

    }

    @Override
    public void initData() {

    }

    @Override
    public void loadMore() {

    }

    @Override
    public void onRefresh() {

    }

    @Override
    public int getLayout() {
        return R.layout.item_home_language;
    }
}
