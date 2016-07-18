package com.yanyuanquan.android.git_mvp.ui.main.home;

import android.support.design.widget.AppBarLayout;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.Toolbar;

import com.yanyuanquan.android.automvp.annotation.Presenter;
import com.yanyuanquan.android.git_mvp.R;
import com.yanyuanquan.android.git_mvp.base.BaseFragment;
import com.yanyuanquan.android.git_mvp.ui.main.adapter.HomePagerAdapter;

import java.util.Arrays;

import butterknife.Bind;


/**
 * Created by guider on 16/7/14.
 * Email guider@yeah.net
 * github https://github.com/guider
 */
@Presenter(HomePresenter.class)
public class HomeFragment extends BaseFragment<HomePresenter> {

    @Bind(R.id.toolbar_main)
    Toolbar toolbarMain;
    @Bind(R.id.tab_layout)
    TabLayout tabLayout;
    @Bind(R.id.appbar)
    AppBarLayout appbar;
    @Bind(R.id.viewpager)
    ViewPager viewpager;
    @Bind(R.id.main_content)
    CoordinatorLayout mainContent;
    String[] lanaguesName = new String[]{"java", "javascript", "go", "css", "objective-c", "python", "swift", "html"};
    HomePagerAdapter adapter;

    @Override
    protected void initView() {
        viewpager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewpager);
    }

    @Override
    protected void initData() {
        adapter = new HomePagerAdapter(getChildFragmentManager(), Arrays.asList(lanaguesName), getContext());
    }

    @Override
    protected void init() {

    }

    @Override
    public int getLayout() {
        return R.layout.fragment_home;
    }

}


