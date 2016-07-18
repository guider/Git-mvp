package com.yanyuanquan.android.git_mvp.base.api;


import com.yanyuanquan.model.api.Token;
import com.yanyuanquan.model.entity.Account;
import com.yanyuanquan.model.entity.Repository;

import java.util.List;

import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by guider on 16/7/13.
 * Email guider@yeah.net
 * github https://github.com/guider
 */
public interface ApiService {
    @PUT("authorizations/clients/689dd44e2f6914201fb4")
    Observable<Account> login(@Body Token token, @Header("Authorization") String authorization);

    @GET("http://trending.codehub-app.com/v2/trending")
    Observable<List<Repository>> getLanguageList(@Query("language") String language, @Query("since") String since);
}
