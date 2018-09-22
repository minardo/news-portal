package com.betaministudio.application.newsportal.Model;

import java.util.List;

/**
 * Created by ARDO on 9/16/2018.
 */

public class WebSiteModel {
    private String status;
    private List<SourceModel> sourceModels;

    public WebSiteModel() {
    }

    public WebSiteModel(String status, List<SourceModel> sourceModels) {
        this.status = status;
        this.sourceModels = sourceModels;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<SourceModel> getSourceModels() {
        return sourceModels;
    }

    public void setSourceModels(List<SourceModel> sourceModels) {
        this.sourceModels = sourceModels;
    }
}
