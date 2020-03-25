package com.stark.service.developerportfolio.service;

import com.stark.service.developerportfolio.model.github.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
public class GithubFetchService implements FetchService<List<Repository>> {

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public List<Repository> fetch(String userName) {
        List<Repository> mock = Arrays.asList(restTemplate.getForObject("https://api.github.com/users/himanshuMaheshwari2311/repos", Repository[].class));
        return mock;
    }
}
