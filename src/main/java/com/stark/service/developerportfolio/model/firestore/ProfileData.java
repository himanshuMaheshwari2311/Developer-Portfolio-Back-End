package com.stark.service.developerportfolio.model.firestore;

import com.stark.service.developerportfolio.Storeable;

public class ProfileData implements Storeable {
    private String userId;
    private String emailId;
    private String name;
    private String pictureUrl;
    private String company;
    private String city;
    private String country;
    private String githubUserId;
    private String stackOverflowUserId;
    private String linkedInUserId;
    private String bio;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

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

    public String getPictureUrl() {
        return pictureUrl;
    }

    public void setPictureUrl(String pictureUrl) {
        this.pictureUrl = pictureUrl;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getGithubUserId() {
        return githubUserId;
    }

    public void setGithubUserId(String githubUserId) {
        this.githubUserId = githubUserId;
    }

    public String getStackOverflowUserId() {
        return stackOverflowUserId;
    }

    public void setStackOverflowUserId(String stackOverflowUserId) {
        this.stackOverflowUserId = stackOverflowUserId;
    }

    public String getLinkedInUserId() {
        return linkedInUserId;
    }

    public void setLinkedInUserId(String linkedInUserId) {
        this.linkedInUserId = linkedInUserId;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    @Override
    public String toString() {
        return "ProfileData{" +
                "userId='" + userId + '\'' +
                ", emailId='" + emailId + '\'' +
                ", name='" + name + '\'' +
                ", pictureUrl='" + pictureUrl + '\'' +
                ", company='" + company + '\'' +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                ", githubUserId='" + githubUserId + '\'' +
                ", stackOverflowUserId='" + stackOverflowUserId + '\'' +
                ", linkedInUserId='" + linkedInUserId + '\'' +
                ", bio='" + bio + '\'' +
                '}';
    }
}
