package com.stark.service.developerportfolio.model.firebase;

import java.util.List;
import java.util.Map;

public class UserData {

    private String emailId;
    private String name;
    private String username;
    private String imageUrl;
    // Github insight object
    // Stackoverflow insight object
    // LinkedIn insight object
    // medium insight object
    private List<String> preferenceList;

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public List<String> getPreferenceList() {
        return preferenceList;
    }

    public void setPreferenceList(List<String> preferenceList) {
        this.preferenceList = preferenceList;
    }
}
