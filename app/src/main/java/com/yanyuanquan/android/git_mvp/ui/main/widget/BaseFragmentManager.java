package com.yanyuanquan.android.git_mvp.ui.main.widget;

import android.app.Activity;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTabHost;
import android.support.v4.app.FragmentTransaction;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by guider on 16/7/17.
 * Email guider@yeah.net
 * github https://github.com/guider
 */
public abstract class BaseFragmentManager implements FragmentProcotol {
    protected static BaseFragmentManager manager;
    protected List<Fragment> fragments;
    protected FragmentManager fm;

    protected BaseFragmentManager(FragmentActivity activity, int containerId) {
        this.fm = activity.getSupportFragmentManager();
        fragments = new ArrayList<>();
        init(containerId);
    }
    protected BaseFragmentManager(Fragment fragment, int containerId) {
        this.fm = fragment.getChildFragmentManager();
        fragments = new ArrayList<>();
        init(containerId);
    }
    @Override
    public void showFrgament(int position) {
        hideFragment();
        FragmentTransaction ft = fm.beginTransaction();
        ft.show(fragments.get(position));
        ft.commit();
    }

    @Override
    public void hideFragment() {
        FragmentTransaction ft = fm.beginTransaction();
        for (Fragment f : fragments) {
            if (f != null) {
                ft.hide(f);
            }
        }
        ft.commit();
    }

    @Override
    public Fragment getFragment(int postion) {
        return fragments.get(postion);
    }

    @Override
    public void onDestory() {
        manager = null;
    }
}
