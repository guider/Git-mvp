package com.yanyuanquan.android.git_mvp.ui.main.widget;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;

/**
 * Created by guider on 16/7/17.
 * Email guider@yeah.net
 * github https://github.com/guider
 */
public class HomeFragmentManager extends BaseFragmentManager {

    public HomeFragmentManager(Fragment fragment, int containerId) {
        super(fragment, containerId);
    }

    public static HomeFragmentManager getInstance(Fragment fragment, int containerId) {
        return (HomeFragmentManager) (manager == null ? manager = new HomeFragmentManager(fragment, containerId) : manager);
    }
    @Override
    public void init(int caontainerId) {

    }
}
