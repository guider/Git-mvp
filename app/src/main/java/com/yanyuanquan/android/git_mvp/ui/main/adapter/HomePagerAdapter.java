package com.yanyuanquan.android.git_mvp.ui.main.adapter;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.yanyuanquan.android.git_mvp.ui.main.home.LanguageFragment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by guider on 16/7/18.
 * Email guider@yeah.net
 * github https://github.com/guider
 */
public class HomePagerAdapter extends FragmentPagerAdapter {
    private List<String> titles;
    private Context context;

    public HomePagerAdapter(FragmentManager fm, String[] titles, Context context) {
        this(fm, Arrays.asList(titles), context);

    }

    public HomePagerAdapter(FragmentManager fm, List<String> titles, Context context) {
        super(fm);
        this.titles = titles;
        this.context = context;
    }

    @Override
    public Fragment getItem(int position) {
        return LanguageFragment.getInstance(context, titles.get(position));
    }

    @Override
    public int getCount() {
        return titles == null ? 0 : titles.size();
    }
}
