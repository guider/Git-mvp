package com.yanyuanquan.android.git_mvp.ui.main;


import com.yanyuanquan.android.automvp.annotation.Presenter;
import com.yanyuanquan.android.git_mvp.base.BaseFragment;

/**
 * Created by guider on 16/7/14.
 * Email guider@yeah.net
 * github https://github.com/guider
 */
@Presenter(EventPresenter.class)
public class EventFragment  extends BaseFragment<EventPresenter>{

    public static EventFragment getInstance() {
        return null;
    }

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
    public int getLayout() {
        return 0;
    }
}
