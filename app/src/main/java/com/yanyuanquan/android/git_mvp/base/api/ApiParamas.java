package com.yanyuanquan.android.git_mvp.base.api;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by guider on 16/7/14.
 * Email guider@yeah.net
 * github https://github.com/guider
 */
public class ApiParamas extends HashMap<String, Object> {

    public ApiParamas() {
    }

    public ApiParamas(String key, Object value) {
        this.put(key, value);
    }

    public ApiParamas add(String key, Object value) {
        this.put(key, value);
        return this;
    }
}
