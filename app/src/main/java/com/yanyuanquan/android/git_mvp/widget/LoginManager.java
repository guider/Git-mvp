package com.yanyuanquan.android.git_mvp.widget;

import android.text.TextUtils;

import com.google.gson.Gson;
import com.yanyuanquan.model.entity.Account;

/**
 * Created by apple on 16/7/7.
 */
public class LoginManager {
    public static final String KEY_ACCOUNT = "key_account";
    public static final String KEY_AID = "key_aid";
    public static final String KEY_USR = "key_usr";
    public static final String KEY_UTP = "key_utp";
    public static final String KEY_ATV = "key_atv";
    public static final String KEY_USET = "key_uset";
    public static final String KEY_EML = "key_eml";
    public static final String KEY_ESET = "key_eset";
    public static final String KEY_PN = "key_pn";
    public static final String KEY_ZN = "key_zn";
    public static final String KEY_SYNC = "key_sync";
    public static final String KEY_LOCK = "key_lock";
    public static final String KEY_REGI = "key_regi";
    public static final String KEY_ATK = "key_atk";


    public static void save(Account account) {
        if (account != null) {
//            Gson gson = new Gson();
//            SP.save(KEY_ACCOUNT, gson.toJson(account));
//            Account.AccountEntity aEntity = account.getAccount();
//            if (aEntity != null) {
//                SP.save(KEY_AID, String.valueOf(aEntity.getAid()));
//                SP.save(KEY_USR, String.valueOf(aEntity.getUsr()));
//                SP.save(KEY_UTP, String.valueOf(aEntity.getUtp()));
//                SP.save(KEY_ATV, String.valueOf(aEntity.getAtv()));
//                SP.save(KEY_USET, String.valueOf(aEntity.getUset()));
//                SP.save(KEY_EML, String.valueOf(aEntity.getEml()));
//                SP.save(KEY_ESET, String.valueOf(aEntity.getEset()));
//                SP.save(KEY_PN, String.valueOf(aEntity.getPn()));
//                SP.save(KEY_ZN, String.valueOf(aEntity.getZn()));
//                SP.save(KEY_SYNC, String.valueOf(aEntity.getSync()));
//                SP.save(KEY_ATK, String.valueOf(aEntity.getAtk()));
//            }
//            Account.BrokerRegiEntity bEntity = account.getBrokerRegi();
//            if (bEntity != null) {
//                SP.save(KEY_LOCK, String.valueOf(bEntity.getLock()));
//                SP.save(KEY_REGI, String.valueOf(gson.toJson(bEntity.getRegi())));
//            }
        }
    }

    public static String getOneKey(String key) {
        return SP.getString(key);
    }


    public static boolean isLogin() {
        return ((!TextUtils.isEmpty(getOneKey(KEY_AID)) && !TextUtils.isEmpty(getOneKey(KEY_ATK))));
    }

    public static void logout() {
        SP.save(KEY_AID, "");
        SP.save(KEY_ATK, "");
    }

    public static void save(String key, String value) {
        SP.save(key, value);
    }
}