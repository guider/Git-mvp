package com.yanyuanquan.android.git_mvp.ui.main;

import com.yanyuanquan.android.automvp.annotation.Model;
import com.yanyuanquan.android.automvp.model.EzModel;
import com.yanyuanquan.android.automvp.presenter.EzPresenter;


@Model(MainModel.class)
public class BaseMainPresenter<V> extends EzPresenter<V,MainModel> {
}
