package com.betaministudio.application.newsportal.Interface;

import com.betaministudio.application.newsportal.Model.WebSiteModel;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by ARDO on 9/17/2018.
 */

public interface NewsService {
    @GET("v1/sources?language=en")
    Call<WebSiteModel> getSources();
}
