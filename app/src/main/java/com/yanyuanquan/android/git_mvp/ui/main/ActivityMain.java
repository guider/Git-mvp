package com.yanyuanquan.android.git_mvp.ui.main;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.yanyuanquan.android.automvp.annotation.Presenter;
import com.yanyuanquan.android.automvp.annotation.Topbar;
import com.yanyuanquan.android.git_mvp.R;
import com.yanyuanquan.android.git_mvp.base.BaseActivity;

@Presenter(MainPresenter.class)
public class ActivityMain extends BaseActivity<MainPresenter> {

    @Override
    protected void initView() {

    }

    @Override
    protected void initData() {

    }

    @Override
    protected void init() {

    }

    @Override
    protected int getLayout() {
        return 0;
    }
}
