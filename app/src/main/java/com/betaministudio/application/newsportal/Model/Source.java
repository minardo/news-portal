package com.betaministudio.application.newsportal.Model;

import java.util.ArrayList;

/**
 * Created by ARDO on 9/16/2018.
 */

class UrlsToLogos {
    private String small, medium, large;

    public String getSmall() {
        return small;
    }

    public void setSmall(String small) {
        this.small = small;
    }

    public String getMedium() {
        return medium;
    }

    public void setMedium(String medium) {
        this.medium = medium;
    }

    public String getLarge() {
        return large;
    }

    public void setLarge(String large) {
        this.large = large;
    }
}

public class Source {
    private String id;
    private String name;
    private String description;
    private String url;
    private String language;
    private String country;
    private UrlsToLogos urlsToLogos;
    private ArrayList<String> sortBysAvailable;

    public Source() {

    }

    public Source(String id, String name, String description, String url, String language, String country, UrlsToLogos urlsToLogos, ArrayList<String> sortBysAvailable) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.url = url;
        this.language = language;
        this.country = country;
        this.urlsToLogos = urlsToLogos;
        this.sortBysAvailable = sortBysAvailable;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public UrlsToLogos getUrlsToLogos() {
        return urlsToLogos;
    }

    public void setUrlsToLogos(UrlsToLogos urlsToLogos) {
        this.urlsToLogos = urlsToLogos;
    }

    public ArrayList<String> getSortBysAvailable() {
        return sortBysAvailable;
    }

    public void setSortBysAvailable(ArrayList<String> sortBysAvailable) {
        this.sortBysAvailable = sortBysAvailable;
    }
}
