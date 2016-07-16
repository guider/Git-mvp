package com.yanyuanquan.android.git_mvp.ui.main.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by guider on 16/7/14.
 * Email guider@yeah.net
 * github https://github.com/guider
 */

public class MainPagerAdapter extends FragmentStatePagerAdapter {
    /**
     * Created by guider on 16/7/14.
     * Email guider@yeah.net
     * github https://github.com/guider
     */
    private List<Fragment> mFragments;
    private List<String> mFragmentTitles;

    public MainPagerAdapter(FragmentManager fm, List<Fragment> mFragments) {
        super(fm);
        this.mFragments = mFragments;
    }

    public MainPagerAdapter(FragmentManager fm, List<Fragment> mFragments, List<String> mFragmentTitles) {
        super(fm);
        this.mFragments = mFragments;
        this.mFragmentTitles = mFragmentTitles;
    }

    public void setData(List<Fragment> mFragments, List<String> mFragmentTitles) {
        this.mFragments = mFragments;
        this.mFragmentTitles = mFragmentTitles;
    }

    public void setData(List<Fragment> mFragments) {
        this.mFragments = mFragments;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return super.isViewFromObject(view, object);
    }

    @Override
    public Fragment getItem(int position) {
        return mFragments.get(position);
    }

    @Override
    public int getCount() {
        return mFragments.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (mFragmentTitles == null || mFragmentTitles.size() <= 0) {
            return "";
        }
        return mFragmentTitles.get(position);
    }

    public void clear() {
        mFragments.clear();
        mFragmentTitles.clear();
        notifyDataSetChanged();
    }


    public void addFragment(Fragment fragment, String titles) {
        if (mFragments == null) mFragments = new ArrayList<Fragment>();
        mFragments.add(fragment);
        if (mFragmentTitles == null) mFragmentTitles = new ArrayList<String>();
        mFragmentTitles.add(titles);
    }
}
