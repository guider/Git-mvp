package com.yanyuanquan.android.automvp;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.yanyuanquan.android.automvp.presenter.BasePresenter;


public abstract class BaseActivity<P extends BasePresenter> extends AppCompatActivity {
    protected P presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayout());
        presenter = BasePresenter.getInstance(this.getClass());
        init();
        initData();
        initView();

    }


    protected abstract void initView();

    protected abstract void initData();

    protected abstract void init();

    protected abstract int getLayout();

    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        presenter.onPostCreate(this);
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        presenter.onDestroyView();
        if (isFinishing())
            presenter.onDestroy();
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        presenter.onSave(outState);

    }

    @Override
    protected void onPause() {
        super.onPause();
        presenter.onPause();
    }

    @Override
    protected void onResume() {
        super.onResume();
        presenter.onResume();
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        presenter.onResult(requestCode, resultCode, data);
    }
}
