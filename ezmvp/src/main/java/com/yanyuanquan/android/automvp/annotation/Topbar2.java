package com.yanyuanquan.android.automvp.annotation;

/**
 * Created by guider on 16/7/8.
 * Email guider@yeah.net
 * github https://github.com/guider
 */
public @interface Topbar2  {
    int cancelId() default 0;
    int value() default 0;
    int confirm() default 0;
    boolean visiable() default true;

}
