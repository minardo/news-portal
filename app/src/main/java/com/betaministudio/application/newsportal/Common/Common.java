package com.betaministudio.application.newsportal.Common;

import com.betaministudio.application.newsportal.Interface.NewsService;
import com.betaministudio.application.newsportal.Remote.RetrofitClient;

/**
 * Created by ARDO on 9/20/2018.
 */

public class Common {
    private static final String BASE_URL = "https://newsapi.org/";

    public static final String API_KEY = "c79d847708f14239bffe96ef198bff48";

    public static NewsService getNewsService() {
        return RetrofitClient.getClient(BASE_URL).create(NewsService.class);
    }
}
