package com.yanyuanquan.android.git_mvp.ui.main;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.NavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import com.yanyuanquan.android.automvp.annotation.Presenter;
import com.yanyuanquan.android.git_mvp.R;
import com.yanyuanquan.android.git_mvp.base.BaseActivity;
import com.yanyuanquan.android.git_mvp.ui.main.adapter.MainPagerAdapter;

import butterknife.Bind;
import butterknife.ButterKnife;


/**
 * Created by guider on 16/7/14.
 * Email guider@yeah.net
 * github https://github.com/guider
 */
@Presenter(MainPresenter.class)
public class ActivityMain extends BaseActivity<MainPresenter> implements NavigationView.OnNavigationItemSelectedListener {
    @Bind(R.id.drawer_layout)
    DrawerLayout drawerLayout;
    @Bind(R.id.main_content)
    CoordinatorLayout coordinatorLayout;
    @Bind(R.id.appbar)
    AppBarLayout appBarLayout;
    @Bind(R.id.toolbar_main)
    Toolbar toolbar;
    @Bind(R.id.tab_layout)
    TabLayout tabLayout;
    @Bind(R.id.viewpager)
    ViewPager viewPager;
    @Bind(R.id.nav_view)
    NavigationView navigationView;
    MainPagerAdapter adapter;

    @Override
    protected void initView() {
        setTab(R.id.nav_home);
    }

    @Override
    protected void initData() {

    }

    @Override
    protected void init() {
        setSupportActionBar(toolbar);
        getSupportActionBar().setHomeButtonEnabled(true); //设置返回键可用
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this,
                drawerLayout, toolbar, R.string.app_name,
                R.string.app_name);
        toggle.syncState();
        drawerLayout.addDrawerListener(toggle);

        navigationView.setNavigationItemSelectedListener(this);

    }

    @Override
    protected int getLayout() {
        return R.layout.activity_main;
    }

    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        return true;
    }

    public void setTab(int id) {

        switch (id) {
            case R.id.nav_home:
                adapter.clear();
                viewPager.setOffscreenPageLimit(3);
                adapter.addFragment(EventFragment.getInstance(), "Events");
                adapter.addFragment(StarredFragment.getInstance(), "Starred");
                adapter.addFragment(UserFragment.getInstance(), "Repository");
                adapter.notifyDataSetChanged();
                tabLayout.setupWithViewPager(viewPager);

                break;
            case R.id.nav_friends:
                adapter.clear();
                viewPager.setOffscreenPageLimit(2);
                adapter.addFragment(FollowerFragment.getInstance(), "Follower");
                adapter.addFragment(FollowingFragment.getInstance(), "Following");
                adapter.notifyDataSetChanged();
                tabLayout.setupWithViewPager(viewPager);
                break;
            case R.id.nav_search: {
                break;
            }
            case R.id.nav_setting:
                return;
            case R.id.nav_about:
                break;
        }

    }
}
