package com.stark.service.developerportfolio.model.github.insight;

import java.util.List;

public class RepositoryData {

    private String repositroyName;
    private String ownerName;
    private boolean isForked;
    private Integer totalCommit;
    private List<String> languages;

    public String getRepositroyName() {
        return repositroyName;
    }

    public void setRepositroyName(String repositroyName) {
        this.repositroyName = repositroyName;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public boolean isForked() {
        return isForked;
    }

    public void setForked(boolean forked) {
        isForked = forked;
    }

    public Integer getTotalCommit() {
        return totalCommit;
    }

    public void setTotalCommit(Integer totalCommit) {
        this.totalCommit = totalCommit;
    }

    public List<String> getLanguages() {
        return languages;
    }

    public void setLanguages(List<String> languages) {
        this.languages = languages;
    }
}
