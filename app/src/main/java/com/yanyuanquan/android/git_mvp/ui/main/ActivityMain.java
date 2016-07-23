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
import android.view.View;

import com.android.guider.util.L;
import com.yanyuanquan.android.automvp.annotation.Presenter;
import com.yanyuanquan.android.git_mvp.R;
import com.yanyuanquan.android.git_mvp.base.BaseActivity;
import com.yanyuanquan.android.git_mvp.ui.main.adapter.MainPagerAdapter;
import com.yanyuanquan.android.git_mvp.ui.main.widget.MainFragmentManager;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by guider on 16/7/14.
 * Email guider@yeah.net
 * github https://github.com/guider
 */
@Presenter(MainPresenter.class)
public class ActivityMain extends BaseActivity<MainPresenter> implements NavigationView.OnNavigationItemSelectedListener, DrawerLayout.DrawerListener {
    @Bind(R.id.drawer_layout)
    DrawerLayout drawerLayout;
    @Bind(R.id.nav_view)
    NavigationView navigationView;

    MainFragmentManager manager;

    @Override
    protected void initView() {
        manager = MainFragmentManager.getInstance(this, R.id.container);
        manager.showFrgament(0);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    protected void initData() {

    }

    @Override
    protected void init() {

    }

    @Override
    protected int getLayout() {
        return R.layout.activity_main;
    }

    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        drawerLayout.closeDrawers();
        switch (item.getItemId()) {
            case R.id.nav_home:
                manager.showFrgament(0);

                break;
            case R.id.nav_friends:
                manager.showFrgament(1);
                break;
        }
        return true;
    }

    @Override
    public void onDrawerSlide(View drawerView, float slideOffset) {

    }

    @Override
    public void onDrawerOpened(View drawerView) {

    }

    @Override
    public void onDrawerClosed(View drawerView) {

    }

    @Override
    public void onDrawerStateChanged(int newState) {

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        manager.onDestory();
    }
}
