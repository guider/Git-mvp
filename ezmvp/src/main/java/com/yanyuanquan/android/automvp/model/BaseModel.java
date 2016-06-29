package com.yanyuanquan.android.automvp.model;

import android.content.Context;

/**
 * Created by guider on 16/5/29.
 * Email guider@yeah.net
 * github https://github.com/guider
 */

public class BaseModel extends UtilModel {

    private Context context;

    public static final <T extends BaseModel> T getInstance(Class<T> clz) {
        return getModel(clz);

    }

    protected void onCreate(Context context) {
        this.context = context;
    }


}
