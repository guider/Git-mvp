package com.yanyuanquan.android.git_mvp.ui.main.widget;

import android.support.v4.app.Fragment;

/**
 * Created by guider on 16/7/17.
 * Email guider@yeah.net
 * github https://github.com/guider
 */
public interface FragmentProcotol {
    void init(int caontainerId);
    void showFrgament(int position);

    void hideFragment();

    Fragment getFragment(int postion);

    void onDestory();
}
