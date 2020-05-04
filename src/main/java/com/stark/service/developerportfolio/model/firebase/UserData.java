package com.stark.service.developerportfolio.model.firebase;

import java.util.List;
import java.util.Map;

public class UserData {

    private String emailId;
    private String name;
    private String imageUrl;
    private String googleToken;

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

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
