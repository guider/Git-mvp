package com.yanyuanquan.android.git_mvp.ui.main.home;

import android.media.MediaPlayer;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
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

    @Bind(R.id.toolbar)
    Toolbar toolbarMain;
    @Bind(R.id.tabs)
    TabLayout tabLayout;
    @Bind(R.id.pager)
    ViewPager viewpager;
    @Bind(R.id.coordinator)
    CoordinatorLayout mainContent;
    String[] lanaguesName = new String[]{"java", "javascript", "go", "css", "objective-c", "python", "swift", "html"};
    HomePagerAdapter adapter;

    @Override
    protected void initView() {
        viewpager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewpager);

        ((AppCompatActivity)getActivity()).setSupportActionBar(toolbarMain);
        ActionBar actionBar = ((AppCompatActivity) getActivity()).getSupportActionBar();
        if (null != actionBar) {
            actionBar.setDisplayHomeAsUpEnabled(true);
            actionBar.setHomeAsUpIndicator(R.drawable.ic_menu_share);
        }
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


