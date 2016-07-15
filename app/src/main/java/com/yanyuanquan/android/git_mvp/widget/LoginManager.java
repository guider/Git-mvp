package com.yanyuanquan.android.git_mvp.widget;

import android.text.TextUtils;

import com.google.gson.Gson;
import com.yanyuanquan.model.entity.Account;

import java.util.List;

/**
 * Created by apple on 16/7/7.
 */
public class LoginManager {
    public static final String KEY_ACCOUNT = "key_account";
    public static String KEY_ID = "id";
    public static String KEY_URL = "url";
    public static String KEY_TOKEN = "token";
    public static String KEY_HASHED_TOKEN = "hashed_token";
    public static String KEY_TOKEN_LAST_EIGHT = "token_eight";
    public static String KEY_NOTE = "note";
    public static String KEY_NOTE_URL = "note_utrl";
    public static String KEY_CREATED_AT = "creatr_at";
    public static String KEY_UPDATED_AT = "update_at";
    public static String kEY_FINDGERPRINT = "findgerprint";
    public static String KEY_SCOPES = "scopes";

    public static void save(Account account) {
        if (account != null) {
            Gson gson = new Gson();
            SP.save(KEY_ACCOUNT, gson.toJson(account));
            if (account != null) {
                SP.save(KEY_ID, String.valueOf(account.getId()));
                SP.save(KEY_URL, String.valueOf(account.getUrl()));
                SP.save(KEY_TOKEN, String.valueOf(account.getToken()));
                SP.save(KEY_HASHED_TOKEN, String.valueOf(account.getHashed_token()));
                SP.save(KEY_TOKEN_LAST_EIGHT, String.valueOf(account.getToken_last_eight()));
                SP.save(KEY_NOTE, String.valueOf(account.getNote()));
                SP.save(KEY_NOTE_URL,account.getNote_url().toString());
                SP.save(KEY_CREATED_AT, String.valueOf(account.getCreated_at()));
                SP.save(KEY_UPDATED_AT, String.valueOf(account.getUpdated_at()));
                SP.save(kEY_FINDGERPRINT, String.valueOf(account.getFingerprint()));
                SP.save(KEY_SCOPES, String.valueOf(account.getScopes()));
            }

        }
    }

    public static String getOneKey(String key) {
        return SP.getString(key);
    }


    public static boolean isLogin() {
        return ((!TextUtils.isEmpty(getOneKey(KEY_HASHED_TOKEN))));
    }

    public static void logout() {
        SP.save(KEY_HASHED_TOKEN, "");
    }

    public static void save(String key, String value) {
        SP.save(key, value);
    }
}