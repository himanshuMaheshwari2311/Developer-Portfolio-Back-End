package com.stark.service.developerportfolio.model.github.insight;

import java.util.List;

public class UserProfile {
    private List<RepositoryData> repositoryData;
    private List<String> followersData;
    private List<String> followingData;

    public List<RepositoryData> getRepositoryData() {
        return repositoryData;
    }

    public void setRepositoryData(List<RepositoryData> repositoryData) {
        this.repositoryData = repositoryData;
    }

    public List<String> getFollowersData() {
        return followersData;
    }

    public void setFollowersData(List<String> followersData) {
        this.followersData = followersData;
    }

    public List<String> getFollowingData() {
        return followingData;
    }

    public void setFollowingData(List<String> followingData) {
        this.followingData = followingData;
    }
}
