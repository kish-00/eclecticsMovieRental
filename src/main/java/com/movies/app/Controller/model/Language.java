package com.movies.app.Controller.model;

import org.springframework.web.bind.annotation.RestController;

import java.sql.Timestamp;


@RestController
public class Language {
    private int languageID;
    private String name;
    private Timestamp lastUpdate;

    public int getLanguageID() {
        return languageID;
    }

    public void setLanguageID(int languageID) {
        this.languageID = languageID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Timestamp getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Timestamp lastUpdate) {
        this.lastUpdate = lastUpdate;
    }
}
