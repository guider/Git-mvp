package com.yanyuanquan.android.git_mvp.ui.main.widget;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;

import com.yanyuanquan.android.git_mvp.ui.main.home.HomeFragment;

/**
 * Created by guider on 16/7/17.
 * Email guider@yeah.net
 * github https://github.com/guider
 */
public class MainFragmentManager extends BaseFragmentManager {

    public MainFragmentManager(FragmentActivity activity, int containerId) {
        super(activity, containerId);
    }

    public static MainFragmentManager getInstance(FragmentActivity activity, int containerId) {
        return (MainFragmentManager) (manager == null ? manager = new MainFragmentManager(activity, containerId) : manager);
    }


    @Override
    public void init(int caontainerId) {
        fragments.add(new HomeFragment());
        fragments.add(new HomeFragment());
        FragmentTransaction ft = fm.beginTransaction();
        for (Fragment f : fragments) {
            if (f != null) {
                ft.add(caontainerId, f);
            }
        }
        ft.commit();
    }
}
