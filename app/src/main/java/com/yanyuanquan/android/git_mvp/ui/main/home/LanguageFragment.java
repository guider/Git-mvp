package com.yanyuanquan.android.git_mvp.ui.main.home;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.ListFragment;

/**
 * Created by guider on 16/7/18.
 * Email guider@yeah.net
 * github https://github.com/guider
 */
public class LanguageFragment extends ListFragment {


    public static Fragment getInstance(Context context, String title) {
        return instantiate(context, title);
    }
}
