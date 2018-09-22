package com.betaministudio.application.newsportal.Interface;

import com.betaministudio.application.newsportal.Model.IconModel;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Url;

public interface IconService {
    @GET
    Call<IconModel> getIconUrl(@Url String url);
}
